package sorting;

import java.io.*;
import java.util.*;

public class Test {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	 Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int arr[]= new int[n];
         for (int i=0;i<n;i++)
         {
            arr[i]=sc.nextInt();
         }
         
    
        
        for (int Arr: arr)
        {
        	 System.out.print(" "+Arr);      
        	 
        }
        
      int min=arr[0];
        for (int i=0;i<n;i++)
        {
        	if (arr[i]<min)
        	{
        		min=arr[i];
        	}
        }
        System.out.println("\t"+min);
    }
}
