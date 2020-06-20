package com.zhq.function;

import java.util.function.Predicate;

public class NumPredicate implements Predicate<Integer> {
    @Override
    public boolean test(Integer input) {
        return input.compareTo(5) > 0;
    }
}
