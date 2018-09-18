package com.dagger.proxy;


import com.duangframework.mvc.proxy.IProxy;
import com.duangframework.mvc.proxy.ProxyChain;

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
