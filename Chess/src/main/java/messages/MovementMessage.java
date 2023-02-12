package messages;

import game.pieces.Coordinate;


public class MovementMessage implements java.io.Serializable {
    public boolean isPieceKilled;
    public Coordinate destinationCoordinate;
    public Coordinate currentCoordinate;
}
