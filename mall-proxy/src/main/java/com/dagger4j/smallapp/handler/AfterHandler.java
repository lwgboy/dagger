package com.dagger4j.smallapp.handler;

import com.dagger4j.exception.MvcException;
import com.dagger4j.mvc.http.IRequest;
import com.dagger4j.mvc.http.IResponse;
import com.dagger4j.mvc.http.handler.IHandler;

/**
 * Created by laotang on 2018/6/24.
 */
public class AfterHandler implements IHandler {
    @Override
    public void doHandler(String target, IRequest request, IResponse response) throws MvcException {
        System.out.println("AfterHandler");
        String body = (String)response.getBody();
        body += "_这是后添加的内容";
        response.write(body);
//        System.out.println(target+"             "+request.getRequestId()+"         "+request.getParameter("key")+ "             "+ body);
    }
}
