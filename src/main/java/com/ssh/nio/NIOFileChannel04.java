package com.ssh.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

/**
 * @author ssh
 * @description 拷贝文件 transferFrom 方法
 * @date 2021/10/13 13:45
 */
public class NIOFileChannel04 {
    public static void main(String[] args) throws Exception {

        //创建相关流
        FileInputStream fileInputStream = new FileInputStream("d:\\a.jpg");
        FileOutputStream fileOutputStream = new FileOutputStream("d:\\a2.jpg");

        //获取各个流对应的 FileChannel
        FileChannel sourceCh = fileInputStream.getChannel();
        FileChannel destCh = fileOutputStream.getChannel();

        //使用 transferForm 完成拷贝
        destCh.transferFrom(sourceCh, 0, sourceCh.size());

        //关闭相关通道和流
        sourceCh.close();
        destCh.close();
        fileInputStream.close();
        fileOutputStream.close();
    }
}
