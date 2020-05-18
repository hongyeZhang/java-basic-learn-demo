package com.zhq.powermockdemo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(PrivateObject.class)
public class PrivateObjectTest {

    @Test
    public void testName2() throws Exception {
        PrivateObject obj = PowerMockito.spy(new PrivateObject());
        PowerMockito.doReturn("privateMock").when(obj, "name");

        String result = obj.name2();
        System.out.println(result);

    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme