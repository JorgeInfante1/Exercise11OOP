package com.exercise11oop.model;

public class Cat 
{
	//Properties 
	private int id;
	private String name;
	private int age;
	
	//Constructors
	public Cat()
	{
	}
	public Cat(int id, String name, int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}

	//Getters(lectura) and Setters(Escritura)
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	//ToString Method
	public String ToString()
	{
		return "Id:["+id+"],name:["+name+"],age:["+age+"]";
	}

}
