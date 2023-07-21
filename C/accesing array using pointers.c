#include<stdio.h>
void main()
{
	int a[]={10,20,30,40};
	int *p=a;
	int i=4;
	while(i--)
	{
		printf("%d ",*p);
		p++;
	}
}
