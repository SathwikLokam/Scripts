#include<iostream>
#include<conio.h>
using namespace std;
class alpha
{
	public:

	void add(int,int);
	void add(float,float);
};

void alpha::add(int a,int b)
{
	cout<<"sum integers are : "<<a+b;
}

void alpha::add(float a,float b)
{
	cout<<"sum of float are : "<<a+b;    //if float are 10.0 it print as intger ie 10 but not 10.0
}

int main()
{
	alpha obj;
	obj.add(100,200);
	obj.add(10.2f,10.4f);  // float parameters are passed followed f at end
}