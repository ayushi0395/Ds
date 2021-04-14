class QuickSort
{
	public static void main(String args[])
	{
		int arr[]={10,-30,80,0,40,-50,70};
		int n=arr.length;
		qsort(arr,0,n-1);
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();				
	}
	static void qsort(int arr[],int l,int h)
	{
		if(l<h)
		{
			int p=partition(arr,l,h);
			qsort(arr,l,p-1); //left array
			qsort(arr,p+1,h); // right array
		}
	}
	static int partition(int arr[],int l,int h)
	{
		int pivot=arr[h];
		int p=l;
		for(int j=l;j<=h;j++)
		{
			if(arr[j]<pivot)
			{
				//swap(arr,j,p);
				int temp=arr[j];
				arr[j]=arr[p];
				arr[p]=temp;
				
				p++;
			}
		}
		//swap(arr,p,h);
		int temp=arr[p];
		arr[p]=arr[h];
		arr[h]=temp;
		
		return p;
		
	}
	
}