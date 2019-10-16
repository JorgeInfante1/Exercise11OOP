package com.exercise11oop.app;

import com.exercise11oop.model.Dog;
public class PerroApp 
{

	public static void main(String[] args) 
	{
	    //Way
		Dog pluto; 
		pluto=new Dog();
		
		//Way 2
		
		pluto.age=15;
		pluto.height=50;
		pluto.id=10;
		
		System.out.println("Puto's Age: "+pluto.age);
		System.out.println("Pluto's Height: "+pluto.height);
		System.out.println("Pluto's ID: "+pluto.id);
		
		Dog firulais=new Dog(1, "Firulais","Labrador",5,60.0);
		
		System.out.println("Firulais age: "+firulais.age);
		System.out.println("Firulais height"+firulais.height);
		System.out.println("Firulaius ID:"+firulais.id);
	}

}
