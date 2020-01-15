package com.wanchopi.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


/**
 * configures the business model
 * @author Wanchopi
 *
 */
@Configuration
@ComponentScan(basePackages = { "com.wanchopi.spring.*" })
@PropertySource({"classpath:config.properties"})
public class SpringappBusinessConfig {

	public SpringappBusinessConfig() {
		super();
	}
}
