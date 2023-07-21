#include<iostream>
using namespace std;
int main()
{
	int rare=0,front=0,sel,range;
	cout<<"Enter the range of queue : ";
	cin>>range;
	int arr[range];
	while(true)
	{
		cout<<"Enter the selction : ";
		cin>>sel;
		switch(sel)
		{
			front%=range;
			rare%=range;
			case 0:
				cout<<"Enter the number to enqueue : ";
				cin>>arr[rare++];
				break;
			case 1:
				cout<<"Item "<<arr[front++]<<" removed"<<endl;
				break;
			default:
				cout<<"-------------->  ";
				for(int i=front;i<rare;i++)
				{
					cout<<arr[i]<<" ";
				}
				cout<<endl;
		}
	}
}
