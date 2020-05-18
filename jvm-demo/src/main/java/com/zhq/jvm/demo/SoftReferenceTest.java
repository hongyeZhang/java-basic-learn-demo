package com.zhq.jvm.demo;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;

/**
 * @author : ZHQ
 * @date : 2020/1/26
 */
public class SoftReferenceTest {

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("SoftReferenceTest finalize");
    }

    public static void main(String[] args) {
        SoftReferenceTest test = new SoftReferenceTest();
        SoftReference<SoftReferenceTest> softReference = new SoftReference<SoftReferenceTest>(test);
        test = null;
        System.out.println("before softReference : " + softReference.get());
        int i = 0;
        List<String> list = new ArrayList<>();
        while (++i < 100000) {
            list.add(String.valueOf(i));
        }
        System.out.println("end");
    }

}
