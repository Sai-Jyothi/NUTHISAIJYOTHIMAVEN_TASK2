package com.epam.maven_task_2;

interface A
{
	void num();
}

class One implements A
{
	public void num()
	{
		System.out.println("Numbers");
	}

	public void display() 
	{
		System.out.println("One");
	}
}

// This indicates Inheritance Implementation
class Two extends One 
{
	@Override
	public void display()
	{
		System.out.println("Two");
	}
	public int add(int x, int y) 
	{
		return x+y;
	}
	
// This shows method overloading
	public double add(double x,double y) 
	{
		return x+y;
	}
}

//This indicates Encapsulation Implementation

class EncapTest 
{
	private String name;
	public String getName() 
	{
		return name;
	}
	public void setName(String newName) 
	{
		name = newName;
	}
}

//This indicates Abstraction Implementation

abstract class TwoWheeler 
{
	public abstract void run();
}
class Honda extends TwoWheeler
{
	public void run()
	{
		System.out.println("\nScooter is Running..");
	}
}

public class OOPS_concepts
{
	public static void main(String[] args) 
	{
		One a=new One();
		a.display();
		Two b=new Two();
		b.display();
		System.out.println(b.add(5,2));
		System.out.println(b.add(7.,2.)); 
		
		//This indicates Polymorphism Implementation
		
		EncapTest encap = new EncapTest();
		encap.setName("Sai Jyothi>>>");
		System.out.print("Name : " + encap.getName() );
		TwoWheeler test = new Honda();
		test.run();
	}
}