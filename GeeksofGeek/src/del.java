
public class del {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Geeks";
		
		//System.out.println(s.charAt(1));
		//s.indexOf(0);
		//System.out.println(s.indexOf("ee"));
				char[] c=s.toCharArray();
				int leng=c.length;
				String r="";

		
		for(int i=0;i<leng;i++)
		{
			if ((i%2)==0)
			{
				r=r+c[i];
			}
		}
		System.out.println(r);
		

	}

}
