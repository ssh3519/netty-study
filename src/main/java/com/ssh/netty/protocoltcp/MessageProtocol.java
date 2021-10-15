package com.ssh.netty.protocoltcp;

/**
 * @author ssh
 * @description 协议包
 * @date 2021/10/15 10:38
 */
public class MessageProtocol {
    private int len; //关键

    private byte[] content;

    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        this.len = len;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }
}
