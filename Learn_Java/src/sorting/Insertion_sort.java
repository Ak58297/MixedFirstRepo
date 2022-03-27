package sorting;

public class Insertion_sort {
	
	public static int[] insertionSorting(int[] arr)
	{
		
		for(int i=1;i<arr.length;i++)
		{
			int elements= arr[i];
			
			int j=i-1;
			
			while(j>=0 && arr[j]>elements)
			{
				arr[j+1]=arr[j];
				j--;
			}
		arr[j+1]=elements;	
		}
		
		
		
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int[] a	=insertionSorting(new int[] {99,1,88,2,77,5,77,6,10,3});
		for(int i=0;i<a.length;i++)
		{
			System.out.print("\t"+a[i]);
		}
		
	}

}
