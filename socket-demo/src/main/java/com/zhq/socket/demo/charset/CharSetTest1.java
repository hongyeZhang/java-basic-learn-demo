package com.zhq.socket.demo.charset;

import org.junit.Test;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedMap;

/**
 * @author : ZHQ
 * @date : 2020/5/21
 */
public class CharSetTest1 {

    @Test
    public void test1() {
        SortedMap<String, Charset> stringCharsetSortedMap = Charset.availableCharsets();
        for (String s : stringCharsetSortedMap.keySet()) {
            System.out.println(s);
        }
    }

    @Test
    public void test2() throws Exception {
        // 创建简体中文对应的Charset
        Charset charset = Charset.forName("GBK");
        // 获取charset对象对应的编码器
        CharsetEncoder charsetEncoder = charset.newEncoder();
        // 创建一个CharBuffer对象
        CharBuffer charBuffer = CharBuffer.allocate(20);
        charBuffer.put("CSDN-专业IT技术社区");
        charBuffer.flip();
        // 将CharBuffer中的字符序列转换成字节序列
        ByteBuffer byteBuffer = charsetEncoder.encode(charBuffer);
        // 循环访问ByteBuffer中的每个字节
        for (int i = 0; i < byteBuffer.limit(); i++) {
            System.out.print(byteBuffer.get(i) + " ");
        }
    }

    @Test
    public void test3() throws Exception {
        // 创建简体中文对应的Charset
        Charset charset = Charset.forName("GBK");
        // 获取charset对象对应的编码器
        CharsetDecoder charsetDecoder = charset.newDecoder();
        // 创建一个ByteBuffer对象
        ByteBuffer byteBuffer = ByteBuffer.allocate(50);
        byteBuffer.put("CSDN-专业IT技术社区".getBytes("GBK"));
        byteBuffer.flip();

        // 将ByteBuffer的数据解码成字符序列
        System.out.println(charsetDecoder.decode(byteBuffer));

    }

    @Test
    public void test4() {
        Charset charset = Charset.forName("utf8");
        //返回一个包含该字符的别名，字符集的别名是不可变的
        Set<String> set = charset.aliases();
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("----------编码----------------");
        ByteBuffer buffer = charset.encode("sdf");
        System.out.println(buffer);


        System.out.println("缓冲区剩余的元素数--" + buffer.remaining());
        while (buffer.hasRemaining()) {
            System.out.println((char) buffer.get());
        }
        System.out.println("缓冲区剩余的元素数--" + buffer.remaining());
        System.out.println("----------解码----------------");
        // 清空缓冲区，将限制设置恢复，如果定义了标记，则将它们丢弃
        buffer.flip();



    }



}
