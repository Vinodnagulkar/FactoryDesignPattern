package com.factory;

public class MainFactory 
{
	public static void main(String[] args) 
	{
		FactoryCreater fc=new FactoryCreater();
		OS object=fc.getInstance("closed");
		System.out.println(object.getClass().getName());
	}
}
