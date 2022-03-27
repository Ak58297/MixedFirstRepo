
public class fisrstClass {
	
	int instance_variable=8;// Instance variable...need a method to be called in main method
	static int k =7; // Static variable...do not need a method to be called in a main method
	
	public void num()
	{
		System.out.println(instance_variable);
		System.out.println("I am in first class method");
	}
	public int num2()
	{
		return 5;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int local_variable=9;
		System.out.println(k);
		fisrstClass ob=new fisrstClass();
		System.out.println(ob.num2());
		System.out.println(local_variable);
		ob.num();
		
		//call second class method
		SecondClass sm=new SecondClass();
		sm.second_class_method();
		

	}

}
