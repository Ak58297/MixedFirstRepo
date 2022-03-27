import java.util.HashSet;
import java.util.Iterator;

public class hashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//No guarantee for sorting
		//No duplicate value
		

		HashSet<String> hs =new HashSet<String>();
		hs.add("First");
		hs.add("Second");
		hs.add("First");
		hs.add("Third");
		hs.add("Third");

		System.out.println(hs);
		
		Iterator<String> it=hs.iterator();
		/*System.out.println(it.next());
		System.out.println(it.next());*/
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
