package learning.aoc.comparators;

import java.util.Comparator;

public class NegateComparator<T> implements Comparator<T> {

    private final Comparator<T> comp1;

    public NegateComparator(Comparator<T> comp1) {
        this.comp1 = comp1;
    }

    @Override
    public int compare(T o1, T o2) {
        return comp1.compare(o2, o1);
    }
}
