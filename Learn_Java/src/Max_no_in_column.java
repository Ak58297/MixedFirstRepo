
public class Max_no_in_column {
	public static void main(String[] args) {
		int arr[][] = { { 7, 3, 5 }, { 4, 0, 9 }, { 1, 35, 2 } };
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

		
		int min = arr[0][0];
		int minNumber_column=0;
		
		for (int i = 0; i < 3; i++) 
		{
			for (int j = 0; j < 3; j++)
			{
				
				if (arr[i][j] < min) {
					min = arr[i][j];
					minNumber_column=j;
				
				}
			}
			

		}
		//Find the max number in the column of ,minimum number
		System.out.println("Minimum number = " + min+" and the column is "+minNumber_column);
		
		//Column for minimum number
		int max=arr[0][minNumber_column] ;
		
		int i=0;
		while( i<3)
		{
			if (arr[i][minNumber_column]>max)
			{
				max=arr[i][minNumber_column];
			}
			i++;
		}
		
		
		System.out.println("Maximum number in the column of minimum number is = "+max);
}
}
