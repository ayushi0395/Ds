class HeapSort
{   
	static void printarray( int x[] , int n)
	{
       int i;
       for(i=0;i<=n;i++)
          	System.out.print(x[i]+" "); 
        System.out.println(); 
	}
	static void show(int x[] ,int i ,  int n)
	{
      int l=i*2 +1;
      int r=i*2 +2;
      int max=i;
    if (l < n && x[l] > x[max])
	{
		max = l;
	}
	if (r < n && x[r] > x[max])
	{
		max = r;
	}
	if(x[i] < x[max])
	{
		int t = x[i];
		x[i] = x[max];
		x[max] = t;
		show(x, max, n);
	}
	}
	static void showloop(int x[],int n)
	{
		for(int i = (n/2)-1; i >= 0; i--) 
		show(x, i, n);
	}
	static void delete(int x[] , int n)
	{
      int i;
	for(i = n-1; i>0; i--)
	{
		int t = x[0];
		x[0] = x[i];
		x[i] = t;
		show(x, 0, i);
		printarray(x, n);
	}
	}
	public static void main(String args[])
	{
		int x[]={1,2,3,4,5,6,7};
		int n =6;
         showloop(x, n);
	     delete(x, n);
	    
	}
}