
public class Solution1 {
	
	static void conRevstr(String S1, String S2)
	{
        // code here
        
        String result= S1.concat(S2);
        char ch[]=result.toCharArray(); 
        String rev = "";
        for(int i=result.length();i>=0;i--)
        {
        	rev=rev+ch[i];
        }
        System.out.println(rev);
        //return rev;
	}

}
