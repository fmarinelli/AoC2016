package learning.aoc.day1.model;

public enum Direction {

    NORTH(0, 1),
    EAST(1, 0),
    SOUTH(0, -1),
    WEST(-1, 0);

    private static final Direction[] directions = Direction.values();

    private int deltaX;
    private int deltaY;

    Direction(int deltaX, int deltaY) {
        this.deltaX = deltaX;
        this.deltaY = deltaY;
    }

    public int moveByX(int steps) {
        return deltaX * steps;
    }

    public int moveByY(int steps) {
        return deltaY * steps;
    }

    public Direction right() {
        return directions[newOrdinal(1)];
    }

    public Direction left() {
        return directions[newOrdinal(-1)];
    }

    private int newOrdinal(int delta) {
        return (directions.length + this.ordinal() + delta) % directions.length;
    }
}
