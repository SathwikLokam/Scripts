#include<stdio.h>
void main()
{
struct info
{
	int value;
	struct info *info;	
};
	struct info node1={10};
	struct info node2={20,&node2};
	node1.info=&node2;
	printf("%d ",node1.info->value);
}
