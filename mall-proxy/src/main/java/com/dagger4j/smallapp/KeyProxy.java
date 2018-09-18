package com.dagger4j.smallapp;

import com.dagger4j.mvc.proxy.IProxy;
import com.dagger4j.mvc.proxy.ProxyChain;

/**
 * Hello world!
 *
 */
public class KeyProxy implements IProxy {

    @Override
    public Object doProxy(ProxyChain proxyChain) throws Exception {
        System.out.println(proxyChain.getTargetClass().getName()+"        ##KeyProxy##           "+proxyChain.getTargetMethod());
        return proxyChain.doProxyChain();
    }
}
