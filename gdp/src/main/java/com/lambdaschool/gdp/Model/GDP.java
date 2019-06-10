package com.lambdaschool.gdp.Model;

import java.util.concurrent.atomic.AtomicLong;

public class GDP
{
	public static final AtomicLong counter = new AtomicLong();
	public long id;
	private String name;
	private String gdp;

	public GDP(String name, String gdp)
	{
		this.id = counter.incrementAndGet();
		this.name = name;
		this.gdp = gdp;
	}

	public GDP(GDP toClone)
	{
		this.id = toClone.getId();
		this.name = toClone.getName();
		this.gdp = toClone.getGdp();
	}


	public long getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getGdp()
	{
		return gdp;
	}

	public void setGdp(String gdp)
	{
		this.gdp = gdp;
	}

	@Override
	public String toString()
	{
		return "GDP{" + "id=" + id + ", name='" + name + '\'' + ", gdp=" + gdp + '}';
	}
}
