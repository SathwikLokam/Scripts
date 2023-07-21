#include<iostream>
using namespace std;
int main()
{
    int a[]={10,20,30,40};
    int *ptr=a;
    ptr++;
    cout<<*ptr;
}