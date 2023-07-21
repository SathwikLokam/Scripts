 #include<iostream>
 using namespace std;
 
 long fab(int num)
 {
 	if(num==0)return 0;
 	if(num==1)return 1;
 	return fab(num-2)+fab(num-1);
 }
 
 int main()
 {
 	cout<<fab(2);	
 }
