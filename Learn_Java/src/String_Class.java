
public class String_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = " Abhishek is a name ";
		/*String s1=new String("Kumar");
		
		System.out.println("Find length ="+s.length());

		System.out.println("trim s="+s.trim());

		System.out.println("find Character at 1= "+s.charAt(1));
		System.out.println("Replace a character= "+s.replace('b', 'B'));
		
		System.out.println("Substring= "+s.substring(2));

		System.out.println("s contains s1= "+s.contains(s1));

		System.out.println("Upper Case= "+s.toUpperCase());
		System.out.println("Concat strings= "+s.concat(s1));
		System.out.println(s.indexOf("is"));
		System.out.println(s.indexOf("z")); // will get a negative sign because no 'z' is present in the string

		
		Boolean b=s.equalsIgnoreCase(s1);
		System.out.println("Boolean output= "+b);
		System.out.println(s.contains("is"));
		
		
		String s3="this_string_is_used_to_spit_a_String";
		String ar[]= s3.split("_");
		System.out.println("\n"+ar[1]);	
		System.out.println(ar[2]);		
		System.out.println(ar[4]);
		System.out.println(ar[5]+"\n"); */
		
		
		StringBuilder sb= new StringBuilder(s);
		System.out.println(sb.reverse());
		System.out.println(s.replace(' ', '*'));
		 for(int i=0;i<s.length();i++)
	        {
	            if(i%2!=0)
	            {	              
	               int ascii=s.charAt(i);
	             
	              
	               sb.append(ascii);
	               
	            }
	            else
	            {
	                sb.append(s.charAt(i));
	            }
	        }
		 String r=sb.toString();
		 
		System.out.println(r);
		StringBuilder sb1= new StringBuilder(r);
		
		System.out.println(sb1.append(3));
		


		
		
		


	}

}
