package com.dagger.proxy.handler;

import com.duangframework.exception.MvcException;
import com.duangframework.mvc.http.IRequest;
import com.duangframework.mvc.http.IResponse;
import com.duangframework.mvc.http.handler.IHandler;

/**
 * Created by laotang on 2018/6/24.
 */
public class AfterHandler implements IHandler {
    @Override
    public void doHandler(String target, IRequest request, IResponse response) throws MvcException {
        System.out.println("AfterHandler");
        String body = (String) response.getBody();
        body += "_这是后添加的内容";
        response.write(body);
//        System.out.println(target+"             "+request.getRequestId()+"         "+request.getParameter("key")+ "             "+ body);
    }
}
