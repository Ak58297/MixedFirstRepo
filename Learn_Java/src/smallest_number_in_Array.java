
public class smallest_number_in_Array 
{
	public static void main(String[] args) 
	{
		int arr[][] = {{0,3,5},{4,8,9},{-1,35,2}}; 
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		int min= arr[0][0];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(arr[i][j]<min)
				{
					min=arr[i][j];
				}
				
			}
			
		}
		System.out.println("Minimum number = "+min);
		
		
	}

}
