package com.cmb.zhq.mockitodemo.test2;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class MainTest {


    @Mock
    Main mockMain;


    @Spy
    Main spyMain;




    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }


    @Test
    public void testFun() {

        // 执行mock，而不是真正部分，所以没有打印任何信息
//        mockMain.fun("mock test One");


        // doCallRealMethod声明后，执行真正部分
        // 但是Mock只能对public（fun1）和protected函数进行mock
        // 对private函数（fun2）仍执行真正部分
        // 所以输出fun和fun2
//        doCallRealMethod().when(mockMain).fun(anyString());
//        mockMain.fun("mock test Two");



        // 执行mock，输出int的默认值0，而不是5
//        System.out.println("val: " + mockMain.getVal());

        // when声明后，既不走真正部分，也不走mock，直接返回thenReturn()中定义的值
        // 注意：该值的类型需要和when中函数返回值类型一致
        when(mockMain.getVal()).thenReturn(10);
        System.out.println("val: " + mockMain.getVal());

    }


    @Test
    public void testFun2() {

        // 执行真正部分
        spyMain.fun("mock test One");

        // 执行真正部分
        System.out.println("val: " + spyMain.getVal());

        // 自定义返回值
        when(spyMain.getVal()).thenReturn(10);
        System.out.println("val: " + spyMain.getVal());

    }


    @Test

    public void argumentMatchersTest(){
        List<String> mock = mock(List.class);
        when(mock.get(anyInt())).thenReturn("Hello").thenReturn("World");
        String result = mock.get(100)+" "+mock.get(200);
        verify(mock,times(2)).get(anyInt());
        assertEquals("Hello World",result);
    }

    @Test
    public void argumentMatchersTest2(){
        Map mapMock = mock(Map.class);
        when(mapMock.put(anyInt(), anyString())).thenReturn("world");
//        System.out.println(mapMock.put(1, "hello"));
        // TODO: 2019/1/9  这个验证部分解释？？？
        verify(mapMock).put(anyInt(), eq("hello"));

    }


    @Test

    public void verifyTestTest() {

        List<String> mock = mock(List.class);

        List<String> mock2 = mock(List.class);

        when(mock.get(0)).thenReturn("hello");

        mock.get(0);

        mock.get(1);

        mock.get(2);

        mock2.get(0);

        verify(mock).get(2);

        verify(mock, never()).get(3);

        verifyNoMoreInteractions(mock);

        verifyZeroInteractions(mock2);

    }




}