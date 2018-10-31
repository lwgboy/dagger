package com.dagger.service;

import com.duangframework.mvc.annotation.Import;
import com.duangframework.mvc.annotation.WebSocket;
import com.duangframework.websocket.IWebSocket;
import com.duangframework.websocket.WebSocketContext;

/**
 * Hello world!
 */
@WebSocket
public class WebSocketService implements IWebSocket{

    @Import
    private MainService mainService;

    @Override
    public void onConnect(WebSocketContext ctx) {
        System.out.println("onConnect:  " + ctx.getSession().getChannel().id()+"                  "+ ctx.getSession().getId());
    }

    @Override
    public void doTask(WebSocketContext ctx) {
        System.out.println("message: " + ctx.getMessage());
        String value = mainService.main(ctx.getMessage());
        ctx.push(ctx.getSession().getId()+": " + value );
    }

    @Override
    public void disConnect(WebSocketContext ctx) {
        System.out.println("disConnect:  " + ctx.getSession().getChannel().id()+"                  "+ ctx.getSession().getId());
    }
}
