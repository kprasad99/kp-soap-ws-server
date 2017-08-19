package com.kp.swasthik.soap;

import java.util.Collections;

import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.feature.LoggingFeature;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CxfConfig {

	@Bean
	public Server bus(SpringBus bus) {
		JaxWsServerFactoryBean bean = new JaxWsServerFactoryBean();
		bean.setServiceClass(HelloWorldImpl.class);
		bean.setAddress("/kp");
		bean.setBus(bus);
		bean.setFeatures(Collections.singletonList(new LoggingFeature()));
		return bean.create();
	}

}
