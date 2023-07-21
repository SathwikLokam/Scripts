#include<iostream>
using namespace std;

class alpha 
{
    private:
    int length;
    public:
    friend int Len(alpha);
    alpha()
    {
        length=100;
    }
    
};
int Len(alpha obj)    //friend function os not a member function of a class
{
    return obj.length;
}

int main()
{
    alpha ob;
    cout<<Len(ob);
}


/*
friend funtion is not a member funtion 
friend function is must be defined outside of the class
friend function is be placed private part or public part
it takes object as parameter
*/