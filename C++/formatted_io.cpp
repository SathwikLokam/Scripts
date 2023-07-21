#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
    //width() gives the field width
    cout.width(4);
    cout<<"12";
    cout.width(4);
    cout<<100<<endl;

    //precision() gives number of digit to be printed
    cout.precision(4);
    cout<<(float)22/7<<endl;   //the precision is 4 so the value will be 3.143

    //fill() fills the charcter in blank space
    cout.fill('_'); //fill remained blanks in width
    cout.width(7);
    cout<<"alpha"<<endl;

    //setf() - set flag needs iomanip header file to use
    /*
    Field Bitmask                   Flagvalues
    ---------------------------------------------------
    adjustfield                 left,rigth or internal
    basefield                   dec,oct or hex
    floatdield                  scientific or fixed
    */

   cout.setf(ios::basefield,ios::oct);  //cout.setf(long <datatype>, Long <datatype>)
   cout<<"Octal of 10 : "<<100<<endl;

   //unsetf()  is used to remove the flag it requires only one parameter
   cout.unsetf(ios::basefield);

}
