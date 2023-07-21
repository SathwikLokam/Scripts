#include<iostream>
using namespace std;
class alpha
{
    public :
    int a;
    alpha(){}
    alpha(int a){this->a=a;}

    void operator ++()
    {
        a++;
    }

};

int main()
{
    alpha obj(10);
    ++obj;
    cout<<obj.a;
}