
public class pattern4 {
	
	public void method1()
	{
		for(int i=1;i<=5;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public void method2()
	{
		for(int i=1;i<=5;i++)
		{
			 for (int j=6-i;j>1; j--)
			 {
				 System.out.print(" ");
			 }
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public void method3()
	{
		for(int i=1;i<=5;i++)
		{
			 for(int j=5;j>=i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
			for(int k =0;k<i;k++)
			{
				System.out.print(" ");
			}
		}
	}
	
	public void method4()
	{
		for(int i=1;i<=5;i++)
		{
			 for (int j=6-i;j>1; j--)
			 {
				 System.out.print(" ");
			 }
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.print(" ");
		
		for(int i=1;i<5;i++)
		{
			 for(int j=5;j>i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
			for(int k =0;k<=i;k++)
			{
				System.out.print(" ");
			}
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		pattern4 ob=new pattern4();
		ob.method1();
		System.out.println();
		ob.method2();
		System.out.println();
		ob.method3();
		System.out.println();
		ob.method4();
		
		
		

	}

}
