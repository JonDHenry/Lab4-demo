/**
 * Lab 4 Demo (Solution)
 * Demonstrate coverage and junit testing tools. Note the 
 * coverage is not 100%, write tests to complete coverage
 * 
 * Demonstrate how to addressed failed tests
 * 
 * @author MoSho
 * @version 02-07-2019
 */

import org.junit.Assert;
import org.junit.Test;

public class PersonTest
{

	/**
	 * Test the empty constructor that takes no parameters
	 */
	@Test
	public void testEmptyConstructor()
	{
		String noname = "NONAME";
		int noage = 0;
		Person per1 = new Person();
		Person per2 = new Person();

		// Assertions to verify functionality of the constructor and getters
		// Assert.assertEquals(Message_to_display_if_test_fails, expectedValue, actualResultFromCode)
		Assert.assertEquals("Empty person1's name incorrect. Should have no name", noname, per1.getName());
		Assert.assertEquals("Empty person1's age incorrect. Should have no age", noage, per1.getAge());

		Assert.assertEquals("Empty person2's name incorrect. Should have no name", noname, per2.getName());
		Assert.assertEquals("Empty person2's age incorrect. Should have no age", noage, per2.getAge());
	}

	/**
	 * Test the constructor that takes parameters
	 */
	@Test
	public void testConstructorParams()
	{
		String name1 = "Fetus";
		int age1 = -1; // boundary case
		Person per1 = new Person(name1, age1);

		String name2 = "New Born";
		int age2 = 0;
		Person per2 = new Person(name2, age2);

		String name3 = "Trump";
		int age3 = 75;
		Person per3 = new Person(name3, age3);

		String name4 = "Jesus";
		int age4 = 2019;
		Person per4 = new Person(name4, age4);

		// Assertions to verify functionality of the constructor and getters
		Assert.assertEquals("Person1's name incorrect.", name1, per1.getName());
		Assert.assertEquals("Person1's age incorrect.", 0, per1.getAge());

		Assert.assertEquals("Person2's name incorrect.", name2, per2.getName());
		Assert.assertEquals("Person2's age incorrect.", age2, per2.getAge());

		Assert.assertEquals("Person3's name incorrect.", name3, per3.getName());
		Assert.assertEquals("Person3's age incorrect.", age3, per3.getAge());

		Assert.assertEquals("Person4's name incorrect.", name4, per4.getName());
		Assert.assertEquals("Person4's age incorrect.", age4, per4.getAge());


		String name5 = "";
		int age5 = 2254;
		// Observe Person coverage before and after removing the comments
		//Person per5 = new Person(name5, age5);
		//Assert.assertEquals("Person5's name incorrect.", "NONAME", per5.getName());
		//Assert.assertEquals("Person5's age incorrect.", age5, per5.getAge());
	}

	// TODO: run code first, then write remaining tests

}