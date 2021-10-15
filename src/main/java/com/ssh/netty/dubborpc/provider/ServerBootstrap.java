package com.ssh.netty.dubborpc.provider;

import com.ssh.netty.dubborpc.netty.NettyServer;

/**
 * @author ssh
 * @description ServerBootstrap 会启动一个服务提供者，就是 NettyServer
 * @date 2021/10/15 14:17
 */
public class ServerBootstrap {

    public static void main(String[] args) {

        //代码代填..
        NettyServer.startServer("127.0.0.1", 7000);
    }
}
