package com.exercise11oop.app;

import com.exercise11oop.model.Perro;
public class PerroApp 
{

	public static void main(String[] args) 
	{
	    //Way
		Perro pluto; 
		pluto=new Perro();
		
		//Way 2
		Perro tribilin=new Perro();
		
		pluto.age=15;
		pluto.heigth=50;
		pluto.id=10;
		
		System.out.println("Puto's Age: "+pluto.age);
		System.out.println("Pluto's Height: "+pluto.heigth);
		System.out.println("Pluto's ID: "+pluto.id);
	}

}
