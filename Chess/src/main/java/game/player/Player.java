package game.player;

import game.board.Board;
import game.move.Move;
import game.piece.Team;

public class Player implements java.io.Serializable {
    public Team team;

    public Player(Team team) {
        this.team = team;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public void makeMove(Board board, Move move) {
        board.getTile(move.getDestinationTile().getCoordinate()).setPiece(move.getCurrentTile().getPiece());
        board.getTile(move.getCurrentTile().getCoordinate()).setPiece(null);
    }
}
