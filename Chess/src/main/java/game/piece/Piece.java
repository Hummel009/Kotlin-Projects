package game.piece;

import game.board.Board;
import game.Move;

import java.util.List;

public abstract class Piece implements java.io.Serializable {
    public Team team;
    public PieceTypes type;

    public Piece(Team team, PieceTypes type) {
        this.setTeam(team);
        this.setType(type);
    }

    public PieceTypes getType() {
        return type;
    }

    public void setType(PieceTypes type) {
        this.type = type;
    }

    public Team getTeam() {
        return this.team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return this.team.toString() + " " + this.type.toString();
    }

    public abstract List<Move> availableMoves(Board board, Coordinate currentCoord);

}
