#include<iostream>
using namespace std;
class alpha
{
    public:
    int a;
    alpha(){};
    alpha(int a)
    {
        this->a=a;
    }

    alpha operator +(alpha ob)
    {
        alpha temp_obj;
        temp_obj.a=this->a+ob.a;
        return temp_obj;
    }
};

int main()
{
    alpha ob1(1);
    alpha ob2(2);
   alpha ob3= ob1+ob2;
   cout<<ob3.a;
}