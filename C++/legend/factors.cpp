#include<iostream>
using namespace std;

int main()
{
    int n=1000000007,count=0;
    for(int i=1;i*i<=n;i++)
    {
        if(n%i==0)
        {
            if(n/i==i)
            {
                cout<<n/i<<endl;
            }
            else 
            {
                cout<<n/i<<endl<<i<<endl;
            }
        }
    }
}