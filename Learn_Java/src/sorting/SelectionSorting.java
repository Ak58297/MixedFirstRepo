package sorting;

public class SelectionSorting {
	
	public static int[] sort(int arr[])
	{
		for(int i=0 ;i<arr.length;i++)
		{
			int min=i;
			for(int j=i+1 ;j<arr.length;j++)
			{
				if(arr[j]<arr[min])
				{
					min=j;
				}
			}
	
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
		return arr;
	}
	

	public static void main(String[] args) {
		

		int array[]=sort(new int[] {2,5,3,7,1,0});
		
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+"\t");
		}
		
	}

}
