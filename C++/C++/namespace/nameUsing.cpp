#include<iostream>
#include"namespaceVar.cpp"
using namespace std;
using namespace globals;
int main()
{
	cout<<"PI = "<<pi;				// globals::pi
}
