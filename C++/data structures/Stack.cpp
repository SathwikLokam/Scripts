#include<iostream>
using namespace std;
int main()
{
    int range,slct=0,top=-1,ele;
    cout<<"Enter the range of stack : ";
    cin>>range;
    int arr[range];
    while(slct!=-1)
    {
        cout<<"Select the option : ";
        cin>>slct;
            if(slct==0)
            {
             if(top==range-1)
             {
                  cout<<"Stack is overflow condition"<<endl;
                  continue;
             }
            cout<<"Enter the element to push : ";
            cin>>ele;
            arr[++top]=ele;
            cout<<"Elements of stack is : ";
            for(int i=0;i<top+1;i++)
                cout<<arr[i]<<" ";
                cout<<endl;
            }
            if(slct==1)
            {
            if(top==-1)
            {
             cout<<"Stact is underflow condition"<<endl;
             continue;
            }
            cout<<"item is popped "<<arr[top--]<<endl;
            cout<<"Elements of stack is : ";
                for(int i=0;i<top+1;i++)
                    cout<<arr[i]<<" ";
                    cout<<endl;
            }
        }
    }