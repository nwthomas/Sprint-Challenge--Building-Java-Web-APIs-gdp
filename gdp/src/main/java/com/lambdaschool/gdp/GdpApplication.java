package com.lambdaschool.gdp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GdpApplication
{
	public static GdpList ourGdpList;

	public static void main(String[] args)
	{
		SpringApplication.run(GdpApplication.class, args);
	}

}
