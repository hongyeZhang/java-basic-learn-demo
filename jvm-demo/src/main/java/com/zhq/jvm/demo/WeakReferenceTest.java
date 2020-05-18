package com.zhq.jvm.demo;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/**
 * @author : ZHQ
 * @date : 2020/1/27
 */
public class WeakReferenceTest {

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("WeakReferenceTest finalize");
    }

    public static void main(String[] args) throws InterruptedException {
        WeakReferenceTest test = new WeakReferenceTest();
        ReferenceQueue<WeakReferenceTest> referenceQueue = new ReferenceQueue<>();
        WeakReference<WeakReferenceTest> weakReference = new WeakReference<WeakReferenceTest>(test, referenceQueue);
        test = null;
        System.out.println("before gc weakReference : " + weakReference.get());
        System.gc();
        Thread.sleep(500);
        System.out.println("after gc weakReference : " + weakReference.get());

    }
}
