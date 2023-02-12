package game.player;

import game.move.Move;
import game.boards.Board;
import game.pieces.*;




public class Player implements java.io.Serializable{
    
    private Team team;
    
    public Player(Team team)
    {
        this.team = team;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
    
    public void makeMove(Board board, Move move)
    {
        board.getTile(move.getDestinationTile().getCoordinate()).setPiece(move.getCurrentTile().getPiece());
        board.getTile(move.getCurrentTile().getCoordinate()).setPiece(null);
   
    }
}
