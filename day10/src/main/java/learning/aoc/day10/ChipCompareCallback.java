package learning.aoc.day10;

import learning.aoc.day10.first.model.Bot;

@FunctionalInterface
public interface ChipCompareCallback {

    void apply(Bot bot, int low, int high);

}
