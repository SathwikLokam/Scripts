import java.util.*;

import javax.xml.validation.Schema;
 class UserExceptionClass extends Exception {
    UserExceptionClass(String str)
    {
        super(str);
    }
}

class UserException
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        try{
        if(a<18) throw new UserExceptionClass("Age should be greater than 18");
        else System.out.println("woooh your age is more than 18");
    }
        catch(Exception e)
        {
             System.out.println(e);

    }
}
}