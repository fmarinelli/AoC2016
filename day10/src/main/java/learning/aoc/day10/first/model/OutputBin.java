package learning.aoc.day10.first.model;

import java.util.ArrayList;
import java.util.List;

public class OutputBin {

    private final int id;
    private final List<Integer> chips = new ArrayList<>();

    public OutputBin(int id) {
        this.id = id;
    }

    public void add(int value) {
        chips.add(value);
    }

    public boolean is(int id) {
        return this.id == id;
    }

    public boolean contains(int chip) {
        return chips.indexOf(chip) > -1;
    }

    public List<Integer> getChips() {
        return chips;
    }
}
