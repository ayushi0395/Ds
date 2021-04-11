#include<stdio.h>
void printArray(int x[], int n)
{
	int i;
	for(i = 0; i < n; i++)
		printf("%d ", x[i]);
	printf("\n");
}
void show(int x[], int i, int n) // 0    1 2
{
	int l = i*2 + 1;
	int r = i*2 + 2;
	int max = i;
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
void showloop(int x[], int n)
{
	for(int i = (n/2)-1; i >= 0; i--) 
		show(x, i, n);
}
void deleteDemo(int x[], int n)
{
	int i;
	for(i = n-1; i>0; i--)
	{
		int t = x[0];
		x[0] = x[i];
		x[i] = t;
		show(x, 0, i);
		printArray(x, n);
	}
}
int main()
{
	int i;
	int x[] = {1, 2, 3, 4, 5, 6, 7};
	int n = sizeof(x) / sizeof(x[0]);
	showloop(x, n);
	deleteDemo(x, n);
	return 0;
}