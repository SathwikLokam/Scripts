#include<iostream>
using namespace std;

class alpha
{
	public:
	int a;
	alpha()
	{
		a=10;
	}
	int ret()
	{
		a++;
		return a;
	}
	int ret1() 
	{
		a++;
		return a;
	}
};


int main()
{
	alpha obj;
	cout<<obj.ret();
	cout<<obj.ret1();
	return 0;
}
