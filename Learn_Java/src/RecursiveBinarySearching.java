
public class RecursiveBinarySearching {

	
	public int recursive_BinarySearch(int ar[], int p, int r, int value)
	{
		if(p>r)
		{
			return -1;
		}
		else
		{
			int q=(p+r)/2;
			if(ar[q]==value)
			{
				return q;
			}
			else if(ar[q]>value)
			{
				return recursive_BinarySearch(ar, p,q-1,value);
			}
			else 
			{
				return recursive_BinarySearch(ar,q+1,r,value);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RecursiveBinarySearching ob=new RecursiveBinarySearching();
		System.out.println(ob.recursive_BinarySearch(new int[] {2,4,6,8,9,10}, 0,6, 6));

	}

}
