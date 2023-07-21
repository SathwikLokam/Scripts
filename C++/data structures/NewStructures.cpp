#include<iostream>
using namespace std;
int main()
{
	struct point
	{
		int a;
		int b;
	};
	point* al;
	al=new point;
	al->a=10;
	cout<<al->a;
	al=new point;
	al->a=20;
	cout<<al->a;
}
