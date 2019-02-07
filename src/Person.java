/**
 * Lab 4 Demo (Solution)
 * Demonstrate using the command line, git, polymorphism, 
 * and unit tests
 * 
 * This class is the main entry point and used to represent
 * people by names and ages
 * 
 * @author MoSho
 * @version 02-07-2019
 */
public class Person
{
	private String name;
	private int age;

	public Person()
	{
		name = "NONAME";
		age = 0;
	}

	public Person(String n, int a)
	{
		setName(n);
		setAge(a);
	}

	public String getName() { return name; }
	public int getAge() { return age; }

	public void setName(String n) 
	{ 
		// ternary operator
		name = (n.isEmpty()) ? "NONAME" : n; 
	}
	public void setAge(int a) { age = (a < 0) ? 0 : a; }


	public String getTaskList()
	{
		return " 1. Walk dog\n 2. Bath\n 3. Eat breakfast\n 4. Make lunch\n" + 
				" 5. Go to work\n 6. Go to gym\n 7. Fall asleep watching Netflix";
	}

	// TODO: run code first, then write a toString()
	// TODO: run code first, then write a equals()

	public static void main(String[] args)
	{
		Person me = new Person("MoSho", 25);
		Hero b_man = new Hero("Batman", 39); 

		System.out.println("\n My TODO List:\n" + me.getTaskList());
		System.out.println("\n Batman's TODO List:\n" + b_man.getTaskList());
	
		// Observe before writing toString()
		System.out.println("\n");
		System.out.println(me);
		System.out.println(b_man);

		// Observe before writing equals()
		System.out.println(b_man == new Hero("Batman", 39));
		System.out.println(b_man.equals(new Hero("Batman", 39)));
	}

}