// C++ code to demonstrate string stream method
// to convert number to string.
#include<iostream>
#include <sstream> // for string streams
#include <string> // for string
using namespace std;
int main()
{
	long long int num;
	cin>>num;
	string str="";
	while(num!=0)
	{
		str=(char)((num%10)+48)+str;
		num=num/10;
	}
	cout<<str;
}

