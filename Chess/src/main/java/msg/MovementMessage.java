package msg;

import game.piece.Coordinate;

public class MovementMessage implements java.io.Serializable {
    public boolean isPieceKilled;
    public Coordinate destinationCoordinate;
    public Coordinate currentCoordinate;
}
