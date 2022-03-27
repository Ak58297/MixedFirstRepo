
public class BinarySearch {
	int p,q,r;
	public int search( int arr[],int x)
	{
		
		 this.p=0;
		 this.r=arr.length-1;
		 
		 while(p<=r)
		 {
			 q=(p+r)/2;
			 if(arr[q]==x)
			 {
				 return q;
			 }
			 else if(arr[q]>x)
			 {
				 r=q-1;
			 }
			 else
			 {
				 p=q+1;
			 }
		 }
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		BinarySearch b=new BinarySearch();
		System.out.println(b.search(new int[] {3,4,5,6,7,8,9},8));
	}

}
