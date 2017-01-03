package learning.aoc.day2.second.model;

import learning.aoc.day2.second.support.InvalidPadButtonException;

import java.util.Objects;

public class RealPadButton {

    private static final char[][] PAD = new char[][]{
            {'x', 'x', '1', 'x', 'x'},
            {'x', '2', '3', '4', 'x'},
            {'5', '6', '7', '8', '9'},
            {'x', 'A', 'B', 'C', 'x'},
            {'x', 'x', 'D', 'x', 'x'},
    };

    public static final RealPadButton ONE = new RealPadButton(2, 0);
    public static final RealPadButton TWO = new RealPadButton(1, 1);
    public static final RealPadButton THREE = new RealPadButton(2, 1);
    public static final RealPadButton FOUR = new RealPadButton(3, 1);
    public static final RealPadButton FIVE = new RealPadButton(0, 2);
    public static final RealPadButton SIX = new RealPadButton(1, 2);
    public static final RealPadButton SEVEN = new RealPadButton(2, 2);
    public static final RealPadButton EIGHT = new RealPadButton(3, 2);
    public static final RealPadButton NINE = new RealPadButton(4, 2);
    public static final RealPadButton A = new RealPadButton(1, 3);
    public static final RealPadButton B = new RealPadButton(2, 3);
    public static final RealPadButton C = new RealPadButton(3, 3);
    public static final RealPadButton D = new RealPadButton(2, 4);

    private int x;
    private int y;

    public RealPadButton(int x, int y) {
        this.x = x;
        this.y = y;
        if ((x < 0 || x >= 5) || (y < 0 || y >= 5) || (PAD[y][x] == 'x')) {
            throw new InvalidPadButtonException(String.format("Invalid PAD button at coordinate [%s, %s]", x, y));
        }
    }

    public RealPadButton up() {
        return move(0, -1);
    }

    public RealPadButton down() {
        return move(0, 1);
    }

    public RealPadButton left() {
        return move(-1, 0);
    }

    public RealPadButton right() {
        return move(1, 0);
    }

    public String getButton() {
        return String.valueOf(PAD[y][x]);
    }

    private RealPadButton move(int dx, int dy) {
        try {
            return new RealPadButton(x + dx, y + dy);
        } catch (InvalidPadButtonException e) {
            return this;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RealPadButton)) return false;
        RealPadButton that = (RealPadButton) o;
        return x == that.x &&
                y == that.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
