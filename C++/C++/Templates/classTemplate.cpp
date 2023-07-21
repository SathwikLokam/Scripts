#include<iostream>
using namespace std;
template <class T>
class alpha
{
    public:
    T a,b;
    alpha(T a,T b)
    {
        this->a=a;
        this->b=b;
    }
    T add()
    {
        return a+b;
    }
};
int main()
{
    alpha <int>obINT(10,34);
    cout<<"Integer class : "<<obINT.add()<<endl;
    alpha <float>obFLOAT(10.3f,12.4f);
    cout<<"Float class   : "<<obFLOAT.add();

}