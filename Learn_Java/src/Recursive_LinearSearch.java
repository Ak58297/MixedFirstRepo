
public class Recursive_LinearSearch {
	
	public static int RecursiveLinearSearch(int ar[], int index, int value)
	{
		int n=ar.length;
		if(index>n)
		{
			return -1;
		}
		else if(ar[index]==value)
		{
			return index;
		}
		else
		{
			return RecursiveLinearSearch(ar,index+1,value);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//RecursiveBinarySearch(new int[] {1,2,3,4,5,6,10,14},0,6);
		
		System.out.println(RecursiveLinearSearch(new int[] {1,2,3,4,5,6,10,14},0,6));
		
		
	

	}

}
