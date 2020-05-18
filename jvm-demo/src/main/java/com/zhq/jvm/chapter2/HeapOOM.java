package com.zhq.jvm.chapter2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : ZHQ
 * @date : 2020/2/10
 */
public class HeapOOM {

    static class OOMObject{
    }

    public static void main(String[] args) {
        List<OOMObject> oomObjectList = new ArrayList<>();
        while (true) {
            oomObjectList.add(new OOMObject());
        }
    }
}
