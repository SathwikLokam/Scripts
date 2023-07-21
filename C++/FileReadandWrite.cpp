#include<iostream>
#include<fstream>
using namespace std;

int main()
{
    fstream file;
    char name[100];
    int pin;
    file.open("text.txt",ios::out);
    cout<<"Enter the name of the student : ";
    gets(name);
    cout<<"Enter the pin of the student : ";
    cin>>pin;

    file.write((char *)name,sizeof(name));   //writing data into a file
    file.close();

    ifstream ptr;
    ptr.open("text.txt",ios::in);        //the pointer is ifsream so there should be ios::in

    char ch;
    while(ptr)
    {
        ptr.get(ch);           // fetching charcter and storing in ch variable
        cout<<ch;
    }
    ptr.close();
}
