
public class HumanClass {

	String name = "A";
	int age;
	int height;
	String job1 = "Local variable job";
	String character;

	public HumanClass(String name, int age, int height, String job, String character)// Arguments will take all the
																						// local variables
	{
		/*
		 * String name1="Abhi"; int age1=34; int height1=8; String job1="No job"; String
		 * character1="Better";
		 */

		System.out.println("I am in parameterized constructor for Humanclass");
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
		System.out.println(job1);
		System.out.println(character);

	}

	public HumanClass()// Arguments will take all the local variables
	{

		System.out.println("I am in default constructor for Humanclass");

	}

	public void IdentifyHuman() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
		System.out.println(job1);
		System.out.println(character);
	}
}