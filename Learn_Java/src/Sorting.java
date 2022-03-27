

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {30,29,3,90,2,1,9};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
			if (arr[i]>arr[j])
			
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
						
			}
			}
			
		}
		for (int num:arr)
		{
			System.out.print(num+" ");
		}
		
		
	}

}
