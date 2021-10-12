package com.ssh;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

import java.util.concurrent.TimeUnit;

/**
 * @author ssh
 * @description
 * @date 2021/10/12 11:26
 */
public class MyServerHandler2 extends ChannelInboundHandlerAdapter {
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        //super.channelRead(ctx, msg);
        //1.如果Handler处理器有一些长时间的业务处理，可以交给taskQueue异步处理
        //获取到线程池eventLoop，添加线程，执行
        ctx.channel().eventLoop().execute(() -> {
            try {
                //长时间操作，不至于长时间的业务操作导致Handler阻塞
                Thread.sleep(1000);
                System.out.println("长时间的业务处理");
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        //2.延时任务队列和上面介绍的任务队列非常相似，只是多了一个可延迟一定时间再执行的设置
        ctx.channel().eventLoop().schedule(() -> {
            try {
                //长时间操作，不至于长时间的业务操作导致Handler阻塞
                Thread.sleep(1000);
                System.out.println("长时间的业务处理");
            } catch (Exception e) {
                e.printStackTrace();
            }
        },5, TimeUnit.SECONDS);//5秒后执行
    }
}
