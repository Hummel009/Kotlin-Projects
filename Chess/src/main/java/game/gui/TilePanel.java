package game.gui;

import game.board.Board;
import game.board.Tile;
import game.move.Move;
import game.piece.Coordinate;
import game.piece.PieceTypes;
import game.piece.Team;
import game.resource.BOARD_Configurations;
import game.resource.GUI_Configurations;
import game.util.BoardUtilities;
import game.util.MoveUtilities;
import msg.Message;
import msg.MovementMessage;
import side_client.Client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class TilePanel extends JPanel {

    Coordinate coordinate;
    JLabel pieceIcon;

    public TilePanel(BoardPanel boardPanel, Coordinate coord, Board chessBoard, Client client) {
        super(new GridBagLayout());
        this.coordinate = coord;
        pieceIcon = new JLabel();
        this.add(pieceIcon);
        setPreferredSize(new Dimension(BOARD_Configurations.TILE_SIZE, BOARD_Configurations.TILE_SIZE));
        assignTileColor(chessBoard);
        assignTilePieceIcon(chessBoard);
        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (client.getTeam() != chessBoard.getCurrentPlayer().getTeam()) {
                    return;
                }

                if (!chessBoard.hasChosenTile()) { 
                    if (chessBoard.getTile(coordinate).hasPiece()) {
                        if (chessBoard.getCurrentPlayer().getTeam() != chessBoard.getTile(coordinate).getPiece().getTeam()) {
                            return;
                        }
                    }

                    chessBoard.setChosenTile(chessBoard.getTile(coordinate));

                } else {
                    Tile destinationTile = chessBoard.getTile(coordinate); 
                    if (MoveUtilities.isValidMove(chessBoard, destinationTile)) {
                        Move move = new Move(chessBoard, chessBoard.getChosenTile(), destinationTile);
                        chessBoard.getCurrentPlayer().makeMove(chessBoard, move);
                        if (move.hasKilledPiece()) {
                            client.game.getBottomGameMenu().killedPiecesListModel.addElement(move.getKilledPiece().toString());
                        }
                        



                        
                        Message msg = new Message(Message.MessageTypes.MOVE);
                        MovementMessage movement = new MovementMessage();
                        movement.currentCoordinate = move.getCurrentTile().getCoordinate();
                        movement.destinationCoordinate = move.getDestinationTile().getCoordinate();
                        if (move.getKilledPiece() != null) {
                            movement.isPieceKilled = true;
                        }
                        msg.content = (Object) movement;
                        client.send(msg);
                        chessBoard.changeCurrentPlayer();
                        client.game.getBottomGameMenu().getTurnLBL().setText("Enemy Turn");
                        client.game.getBottomGameMenu().getTurnLBL().setForeground(Color.RED);

                        if (move.hasKilledPiece()) {
                            if (move.getKilledPiece().getType() == PieceTypes.KING) {
                                Team winnerTeam;
                                winnerTeam = (move.getKilledPiece().getTeam() == Team.BLACK) ? Team.WHITE : Team.BLACK;
                                JOptionPane.showMessageDialog(null, "Winner: " + winnerTeam.toString());
                                Message message = new Message(Message.MessageTypes.END);
                                message.content = null;
                                client.send(message);
                            }
                        }

                    } else {
                        if (destinationTile.hasPiece()) {
                            if (chessBoard.getCurrentPlayer().getTeam() != chessBoard.getTile(coordinate).getPiece().getTeam()) {
                                return;
                            }
                        }
                        chessBoard.setChosenTile(destinationTile);

                    }
                    if (MoveUtilities.controlCheckState(chessBoard, Team.BLACK)) {
                        JOptionPane.showMessageDialog(null, "Check state for team : " + Team.BLACK.toString());

                        
                        Message msg = new Message(Message.MessageTypes.CHECK);
                        
                        msg.content = (Object) Team.BLACK;
                        client.send(msg);
                    } else if (MoveUtilities.controlCheckState(chessBoard, Team.WHITE)) {
                        JOptionPane.showMessageDialog(null, "Check state for team : " + Team.WHITE.toString());
                        
                        Message msg = new Message(Message.MessageTypes.CHECK);
                        
                        msg.content = (Object) Team.WHITE;
                        client.send(msg);
                    }
                }
                boardPanel.updateBoardGUI(chessBoard);

            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
        validate();
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public void assignTilePieceIcon(Board board) {
        
        Tile thisTile = board.getTile(this.coordinate);
        if (thisTile == null) {
            System.out.println("Tile is null");
            return;

        }
        if (thisTile.hasPiece()) {
            
            
            pieceIcon.setIcon(BoardUtilities.getImageOfTeamPiece(thisTile.getPiece().getTeam(), thisTile.getPiece().getType()));
            pieceIcon.validate();
        } else if (!thisTile.hasPiece()) {
            pieceIcon.setIcon(null);
            pieceIcon.validate();
        }

        
    }

    public void assignTileColor(Board board) {

        if (this.coordinate.getX() % 2 == 0 && this.coordinate.getY() % 2 == 0) {
            this.setBackground(GUI_Configurations.creamColor);
        } else if (this.coordinate.getX() % 2 == 0 && this.coordinate.getY() % 2 == 1) {
            this.setBackground(GUI_Configurations.lightCyanColor);
        } else if (this.coordinate.getX() % 2 == 1 && this.coordinate.getY() % 2 == 0) {
            this.setBackground(GUI_Configurations.lightCyanColor);
        } else if (this.coordinate.getX() % 2 == 1 && this.coordinate.getY() % 2 == 1) {
            this.setBackground(GUI_Configurations.creamColor);
        }
        if (board.hasChosenTile()) {
            if (this.coordinate.equals(board.getChosenTile().getCoordinate())) {
                this.setBackground(Color.GREEN);
            }

        }
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));

    }
}
