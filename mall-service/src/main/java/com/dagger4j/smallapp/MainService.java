package com.dagger4j.smallapp;

import com.dagger4j.mvc.annotation.Proxy;
import com.dagger4j.mvc.annotation.Service;

/**
 * Hello world!
 *
 */
@Service
public class MainService {

    @Proxy(value = MainProxy.class, index =0)
    public String main( String args ) {
        System.out.println( "Hello "+args+"!" );
        return "Hello "+args+"!";
    }

//    @Proxy(value = KeyProxy.class, index = 3)
//    public String key( String args ) {
//        System.out.println( "Hello "+args+" Key!" );
//        return "Hello "+args+" Key!";
//    }
}
