
public class Reverse_a_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "String to be reverse";
		
		String reverse="";
		
		// Method 1
		/*char[] ch= s.toCharArray();
		int len=ch.length;
		for(int i=len-1;i>=0;i--)
		{
			reverse=reverse+(ch[i]);
		}
		System.out.println(reverse); */
		
		//Method 2
		
		for(int i=s.length()-1;i>=0;i--)
			
		{
			reverse=reverse+s.charAt(i);
		}
		System.out.println(reverse);
		
		if(reverse.equals(s))
		{
			System.out.println("It is reversed and it is a palindrome ");
		}
		else
			System.out.println("It is reversed and is not a palindrome");
		
		

	}

}
