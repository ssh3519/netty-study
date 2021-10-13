package com.ssh.nio;

import java.nio.IntBuffer;

/**
 * @author ssh
 * @description 缓冲区（Buffer）：缓冲区本质上是一个可以读写数据的内存块，可以理解成是一个容器对象（含数组），
 * 该对象提供了一组方法，可以更轻松地使用内存块，，缓冲区对象内置了一些机制，能够跟踪和记录缓冲区的状态变化情况。
 * Channel 提供从文件、网络读取数据的渠道，但是读取或写入的数据都必须经由 Buffer
 * @date 2021/10/13 11:21
 */
public class BasicBuffer {
    public static void main(String[] args) {

        //举例说明 Buffer 的使用(简单说明)
        //创建一个 Buffer，大小为 5，即可以存放 5 个 int
        IntBuffer intBuffer = IntBuffer.allocate(5);

        //向buffer存放数据
        //intBuffer.put(10);
        //intBuffer.put(11);
        //intBuffer.put(12);
        //intBuffer.put(13);
        //intBuffer.put(14);
        for (int i = 0; i < intBuffer.capacity(); i++) {
            intBuffer.put(i * 2);
        }
        //如何从 buffer 读取数据
        //将 buffer 转换，读写切换(!!!)
        intBuffer.flip();
        while (intBuffer.hasRemaining()) {
            System.out.println(intBuffer.get());
        }
    }
}
