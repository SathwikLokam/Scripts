import java.io.*;
class alpha
{
    public static void main(String args[]) throws IOException
    {
        int count=0,num1=2,num2=3;
        while(num1>=0 && num2>=0)
        {
                count++;
            if(num1>num2)num1=num1-num2;
            else num2=num2-num1;
        }
        System.out.println(count);
        
    }
}