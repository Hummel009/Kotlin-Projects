package game.pieces;


public class Coordinate implements java.io.Serializable {
    private int x;
    private int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
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
