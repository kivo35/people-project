/**
 * 
 */
package com.sqa.kv.people.project;

import org.junit.Test;

/**
 * @author Kirill
 * 
 */
public class PelopleTest
{

	@Test
	public void test()
	{
		Person kv = new Person("Kiryl Voitau", 22, "Martinez, CA", "QA Engineer");
		Person john = new Person("John", 45, "234 2nd ave", "Military staff");
		Person jack = new Person("Jack", 32, "Berkeley", "Scientist");

		Person[] people = new Person[] { kv, john, jack };

		for (Person p : people)
		{
			System.out.println("Person details: " + p);
			System.out.println("Person does work: ");
			p.doWork();
			System.out.println("Person sleeps: ");
			p.sleep();
			System.out.println("Person moves: ");
			p.move();
		}
	}
}
