package com.mysoft;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;


/**
 * 使用外部容器时所用
 * @author xuchg1
 *
 */
public class ServletInitializer extends SpringBootServletInitializer{

	protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
		return application.sources(SlApplication.class);
	}
}
