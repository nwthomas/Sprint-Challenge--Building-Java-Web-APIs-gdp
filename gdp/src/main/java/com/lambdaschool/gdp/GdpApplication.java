package com.lambdaschool.gdp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

@SpringBootApplication
public class GdpApplication
{
	public static GdpList ourGdpList;

	public static void main(String[] args)
	{
		ourGdpList = new GdpList();
		ApplicationContext ctx = SpringApplication.run(GdpApplication.class, args);

		DispatcherServlet dispatcherServlet = (DispatcherServlet)ctx.getBean("dispatcherServlet");
		dispatcherServlet.setThrowExceptionIfNoHandlerFound(true);
	}

}
