package com.kp.swasthik.soap;

import com.kp.swasthik.ws.HelloWorld;

public class HelloWorldImpl implements HelloWorld {

	@Override
	public String sayHello(String name) {
		return "Hello " + name + " welcome to Cxf World";
	}

}
