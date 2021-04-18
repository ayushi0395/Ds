class CountingSort
{
	public static void main(String args[])
	{
		int arr[]={1,-1,2,-1,4,1,7,4,3};
		
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}

		for(int i=0;i<arr.length;i++)
		{
			arr[i]=arr[i]-min;
		}	
		
		                                            //calling countArray() method
		countArray(arr,arr.length,min);		
		
	}
	
	static void countArray(int arr[],int n,int min)
	{	
		int max=arr[0];		
		for(int i=0;i<n;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}			
		}				
	
		int count[]=new int[max+1];		
		for(int i=0;i<n;i++)
		{
			count[arr[i]]=count[arr[i]]+1;
		}	
	
                                                            
		                                           //reset count[]	
		for(int i=1;i<=max;i++)
		{
			count[i]=count[i]+count[i-1];
		}
		
		
		int output[]=new int[n];                   //final output array in sorted form.		
		for(int i=n-1;i>=0;i--)
		{
			output[--count[arr[i]]]= arr[i];
			
		}
		
		for(int i=0;i<n;i++)
		{
			arr[i]=output[i];
		}
		
		for(int i=0;i<n;i++)
		{
			arr[i]=arr[i]+min;
		}
		
		
		for(int i:arr)                             //printing final sorted output array.
		{
			System.out.print(i+" ");
		}
		System.out.println();
		
	}
}
