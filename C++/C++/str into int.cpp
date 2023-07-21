#include<iostream>
using namespace std;
int main()
{
	string str;
	cin>>str;
	long long int num=0;
	int i=0;
	while(i!=str.length())
	{
		num=(num*10)+((int)str[i])-48;
		i++;
	}
	cout<<num;
}
