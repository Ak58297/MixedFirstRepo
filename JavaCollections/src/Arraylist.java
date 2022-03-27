import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ArraList,LinkedList,vector- Implementing List interface
		//can have duplicate value
		//Array have fixed size but Arraylist can have dynamic size
		//you can access and insert any value in any index

		ArrayList<String> a = new ArrayList<String>();
		a.add("Abhishek");
		a.add("john");
		a.add("Raj");
		System.out.println(a);
		a.get(1);
		System.out.println(a.get(1));
		a.remove(2);
		System.out.println(a);
		System.out.println(a.contains("Abhishek"));
		a.add("Abhishek");
		a.add("Abhishek");

		a.add("john");
		a.add(0, "First");
		System.out.println(a);
		
		System.out.println(a.size());
		
		System.out.println(a.isEmpty());

	}

}
