package game.piece;

public class Coordinate implements java.io.Serializable {
    public final int x;
    public final int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "[X:" + x + ", Y:" + y + "]";
    }

    @Override
    public boolean equals(Object obj) {
        return (((Coordinate) obj).getX() == this.x && ((Coordinate) obj).getY() == this.y);
    }

    public Coordinate plus(Coordinate coord) {
        return new Coordinate(this.x + coord.getX(), this.y + coord.getY());
    }
}
