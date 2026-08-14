package twopijnters;

import java.util.Arrays;
import java.util.Scanner;

public class twosum 
{

		public static void main(String args[])
		{
			
			Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("enter the element of array");
		for(int i=0;i<arr.length;i++)
		{
		   arr[i]=sc.nextInt();
		}
		
		
		
		int target=9;
		
		int [] result=twosum(arr,9);
		
		if(result!=null)
		{
			System.out.println(result[0]+","+result[1]);
		}
		else
		{
			System.out.println("pair not found");
		}
		
		}



		        
		    

		public static int[] twosum(int arr[],int target)
		{
		    int i=0,j=arr.length-1;
            while(i<j)
		    {
		    int sum=arr[i]+arr[j];
		    if(sum==target)
		    {
		    return  new int[]{arr[i],arr[j]};
		    }
		    if(sum<target)
		    {
		    i++;
		    }
		    else
		    {
		    j--;
		    }

		       
		    }
            
            return null;


		}
		    

		

}
