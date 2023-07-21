#include<stdio.h>
void push();
void pop();
void isEmpty();
void isFull();

struct stack
{
	int value[10];
	int top;
}stack_1;

void main()
{
	stack_1.top=-1;
	char loop='y';
	int choice,i;
	while(loop=='y')
	{
		printf("\nSelect 0 to push\t select 1 to pop  : ");
		scanf("%d",&choice);
		if(choice==0)push();
		else pop();
		printf("\n------>The contents in stack are : ");
		for(i=stack_1.top;i!=-1;i--)
		{
			printf(" %d ",stack_1.value[i]);
		}
}
}
void push()
{
	if(stack_1.top!=9)
	{
	printf("Enter the element to insert : ");
	int ele;
	scanf("%d",&ele);
	stack_1.value[++stack_1.top]=ele;
	}
	else printf("Stack is full");
}
void pop()
{
	if(stack_1.top!=-1) printf("%d id popped \n",stack_1.value[stack_1.top--]);
	else printf("Stack is empty");
}
