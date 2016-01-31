/**
 * 
 */
package com.sqa.kv.people.project;

/**
 * Create a Person class. Create the variables name, age, address, and jobTitle
 * for the Person class. Create a constructor which assigns default values for
 * the Person class. Override the toString method with more meaningful output
 * (Use option in Menu, Source > Generate toString(). Create the methods
 * doWork(), sleep(), and move() using System.out calls to console.
 */

public class Person
{
	// Create variables to store person data
	private String name;
	private int age;
	private String address;
	private String jobTitle;

	public Person()
	{
		// TODO Auto-generated constructor stub
	}

	// create a constructor to store person information
	public Person(String name, int age, String address, String jobTitle)
	{
		this.name = name;
		this.age = age;
		this.address = address;
		this.jobTitle = jobTitle;
	}

	public String doWork()
	{
		System.out.println("He's working at " + this.jobTitle);
		return null;
	}

	// create acessor methods
	public final String getAddress()
	{
		return this.address;
	}

	public final int getAge()
	{
		return this.age;
	}

	public final String getJobTitle()
	{
		return this.jobTitle;
	}

	public final String getName()
	{
		return this.name;
	}

	public String move()
	{
		System.out.println("Why not keep moving for another " + this.getAge() + " years!");
		return null;
	}

	// create mutator methods
	public void setAddress(String address)
	{
		this.address = address;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public void setJobTitle(String jobTitle)
	{
		this.jobTitle = jobTitle;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String sleep()
	{
		System.out.println("He is sleeping on a rock near " + this.getName());
		return null;
	}

	@Override
	public String toString()
	{
		return "Person [name=" + this.name + ", age=" + this.age + ", address=" + this.address + ", jobTitle="
				+ this.jobTitle + "]";
	}
}
