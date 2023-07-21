#include<iostream>
using namespace std;
template <class T>
T add(T a,T b)
{
    return a+b;
}
int main()
{
    cout<<"Addition of integers : "<<add(10l,34l)<<endl;
    cout<<"Addition of floats   : "<<add(1.4f,2.5f)<<endl;
    cout<<"Addition of character: "<<(int)add('D','A');
}