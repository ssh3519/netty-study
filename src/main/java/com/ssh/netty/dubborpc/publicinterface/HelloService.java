package com.ssh.netty.dubborpc.publicinterface;

/**
 * @author ssh
 * @description 这个是接口，是服务提供方和 服务消费方都需要HelloServiceImpl
 * @date 2021/10/15 14:13
 */
public interface HelloService {

    String hello(String mes);
}
