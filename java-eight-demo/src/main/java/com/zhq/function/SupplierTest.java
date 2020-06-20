package com.zhq.function;

import org.junit.Test;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierTest {

    @Test
    public void test1() {
        Supplier<Integer> integerSupplier = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return new Random().nextInt();
            }
        };

        System.out.println(integerSupplier.get());

    }

    @Test
    public void test2() {
        Supplier<Integer> supplier = () -> new Random().nextInt();
        System.out.println(supplier.get());

    }

    @Test
    public void test3() {
        Supplier<Double> supplier = Math::random;
        System.out.println(supplier.get());
    }


}
