package learning.aoc.day2.first.model;

public enum PadButton {
    ONE, TWO, THREE,
    FOUR, FIVE, SIX,
    SEVEN, EIGHT, NINE;

    public PadButton up() {
        int ordinal = this.ordinal() - 3;
        if (ordinal >= ONE.ordinal()) {
            return PadButton.values()[ordinal];
        }
        return this;
    }

    public PadButton down() {
        int ordinal = this.ordinal() + 3;
        if (ordinal <= NINE.ordinal()) {
            return PadButton.values()[ordinal];
        }
        return this;
    }

    public PadButton left() {
        if((this.ordinal() % 3) >= 1) {
            return PadButton.values()[this.ordinal() - 1];
        }
        return this;
    }

    public PadButton right() {
        if((this.ordinal() % 3) < 2) {
            return PadButton.values()[this.ordinal() + 1];
        }
        return this;
    }
}
