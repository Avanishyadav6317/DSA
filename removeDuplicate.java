package twopijnters;

public class removeDuplicate 
{
	public int removeDuplicates(int nums[])
	{
		int n=nums.length;
		int i=0;
		int j=i+1;
		int unique=1;
		
		while(j<n)
		{
			if(nums[i]==nums[j])
			{
				j++;
			}
			else if(nums[i]!=nums[j])
			{
				i++;
				nums[i]=nums[j];
				unique++;
				j++;
			}
		}
		return unique;
	}
	
	public static void main(String[] args) 
	{
		int nums[]= {1,1,1,2,2,3,3};
		
		removeDuplicate rem=new removeDuplicate();
		int unique=rem.removeDuplicates(nums);
		
		System.out.print("output"+unique+" ");
	
		System.out.print("[");

		for(int i=0;i<unique;i++)
		{
			System.out.print(nums[i]+",");

		}
		System.out.print("]");

		
	}

}
