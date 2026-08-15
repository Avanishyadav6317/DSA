package twopijnters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class sorted2method 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the element of array");
		int[] arr=new int[6];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}

	int result[]=squarearray(arr);
	System.out.println(Arrays.toString(result));
	
	
	
		
		
	}
	public static int[] squarearray(int nums[])
	
	{
		int n=nums.length;
		
		ArrayList<Integer>pos=new ArrayList<Integer>();
		ArrayList<Integer>neg=new ArrayList<Integer>();
		int i=0;
		
		while(i<n)
		{
			if(nums[i]<0)
			{
				neg.add(nums[i]*nums[i]);
			}
			else
			{
				pos.add(nums[i]*nums[i]);
			}
			i++;
		}
		
		Collections.sort(neg);
		System.out.println(neg);
		System.out.println(pos);
		
		int res[]=new int[neg.size()+pos.size()];

		
		
		int a=0,j=0,id=0;
		
		while(a<neg.size() && j<pos.size())
		{
			if(neg.get(a)>pos.get(j))
			{
				res[id]=pos.get(j);
				id++;
				j++;
			}
			else
			{
				res[id]=neg.get(a);
				a++;
				id++;
			}
		}
		while(a<neg.size())
		{
			res[id]=neg.get(a);
			id++;
			a++;
		}
		while(j<pos.size())
		{
			res[id]=pos.get(j);
			id++;
			j++;
		}

		return res ;
	}


}
