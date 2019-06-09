package com.lambdaschool.gdp.Model;

import java.util.concurrent.atomic.AtomicLong;

public class Gdp
{
	public static final AtomicLong counter = new AtomicLong();
	public long id;
	private String name;
	private int gdp;

	public Gdp(String name, int gdp)
	{
		this.id = counter.incrementAndGet();
		this.name = name;
		this.gdp = gdp;
	}

	public Gdp(Gdp toClone)
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

	public int getGdp()
	{
		return gdp;
	}

	public void setGdp(int gdp)
	{
		this.gdp = gdp;
	}

	@Override
	public String toString()
	{
		return "Gdp{" + "id=" + id + ", name='" + name + '\'' + ", gdp=" + gdp + '}';
	}
}
