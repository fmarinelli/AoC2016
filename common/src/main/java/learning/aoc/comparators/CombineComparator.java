package learning.aoc.comparators;

import java.util.Comparator;

public class CombineComparator<T> implements Comparator<T> {

    private final Comparator<T> comp1;
    private final Comparator<T> comp2;

    public CombineComparator(Comparator<T> comp1, Comparator<T> comp2) {
        this.comp1 = comp1;
        this.comp2 = comp2;
    }

    @Override
    public int compare(T o1, T o2) {
        int compare = comp1.compare(o1, o2);
        if (compare != 0) {
            return compare;
        }
        return comp2.compare(o1, o2);
    }
}
