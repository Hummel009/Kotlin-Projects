package game.gui;

import game.board.Board;
import game.piece.Team;
import game.Data;
import msg.Message;
import side_client.Client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Table {
    public JFrame gameFrame;
    public BoardPanel boardPanel;
    public Board chessBoard;
    public MainMenu mainMenu;
    public InGameBottomMenu bottomGameMenu;
    public Client client;

    public Table() {
        this.gameFrame = new JFrame("Chess");
        this.gameFrame.setLayout(new BorderLayout());
        this.gameFrame.setSize(Data.OUTER_FRAME_DIMENSION);
        this.mainMenu = new MainMenu();
        this.client = new Client(this);
        this.client.connect("127.0.0.1", 4000);
        if (this.client.socket == null) {
            JOptionPane.showMessageDialog(null, "Servera bağlanılamadı");
            System.exit(0);
        }
        createMainMenu();
        this.gameFrame.setVisible(true);
    }

    public void createMainMenu() {
        this.mainMenu.getInfoLBL().setText("");
        this.mainMenu.getInfoLBL().setVisible(false);
        this.mainMenu.getPlayBTN().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!client.isPaired) {
                    mainMenu.getInfoLBL().setVisible(true);
                    mainMenu.getInfoLBL().setText("Matching...");
                    mainMenu.getPlayBTN().setEnabled(false);
                    Message msg = new Message(Message.MessageTypes.PAIRING);
                    msg.content = "ESLESME";
                    client.send(msg);
                }
                if (client.isPaired) {
                    mainMenu.getInfoLBL().setText("Matched");
                    mainMenu.getInfoLBL().setText("Game is starting...");
                    mainMenu.getPlayBTN().setEnabled(true);
                    mainMenu.getInfoLBL().setText("");
                    mainMenu.getInfoLBL().setVisible(false);
                    createGamePanel();
                }
            }
        });
        this.gameFrame.add(mainMenu, BorderLayout.CENTER);
    }

    public void createGamePanel() {
        this.gameFrame.remove(mainMenu);
        this.chessBoard = new Board();
        this.boardPanel = new BoardPanel(this.chessBoard, this.client);
        this.bottomGameMenu = new InGameBottomMenu();
        this.bottomGameMenu.getPlayersColorLBL().setText("Your color is " + this.client.team.toString());
        if (this.client.team == Team.WHITE) {
            this.bottomGameMenu.getTurnLBL().setText("Your Turn");
            this.bottomGameMenu.getTurnLBL().setForeground(Color.GREEN);
        } else {
            this.bottomGameMenu.getTurnLBL().setText("Enemy Turn");
            this.bottomGameMenu.getTurnLBL().setForeground(Color.RED);
        }
        this.gameFrame.add(boardPanel);
        this.gameFrame.add(this.boardPanel, BorderLayout.CENTER);
        this.gameFrame.add(this.bottomGameMenu, BorderLayout.PAGE_END);

        this.gameFrame.setVisible(true);
    }

    public MainMenu getMainMenu() {
        return mainMenu;
    }

    public InGameBottomMenu getBottomGameMenu() {
        return bottomGameMenu;
    }

    public JFrame getGameFrame() {
        return gameFrame;
    }

    public BoardPanel getBoardPanel() {
        return boardPanel;
    }

    public Board getChessBoard() {
        return chessBoard;
    }
}
