
public class Sol1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S1 ="Abhishek";
		String S2 ="Kbhishek";
		 String result= S1.concat(S2);
	        char ch[]=result.toCharArray(); 
	        String rev = "";
	        int len=ch.length;
	       for(int i=len-1;i>=0;i--)
	        {
	        	rev=rev+ch[i];
	        }
	        System.out.println(rev);
	        //return rev;

	}

}
