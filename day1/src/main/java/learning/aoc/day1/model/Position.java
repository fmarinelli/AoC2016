package learning.aoc.day1.model;

public class Position {

    private int x = 0;
    private int y = 0;

    public Position() {
    }

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Position moveBy(int dx, int dy) {
        return new Position(x + dx, y + dy);
    }

    public int getBlocksAway() {
        return Math.abs(getX()) + Math.abs(getY());
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Position{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
