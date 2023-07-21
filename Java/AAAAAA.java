public class AAAAAA
{
    public static boolean areNumbersAscending(String s) {
        int temp=Integer.MIN_VALUE;
        int pre;
        String num="";
        boolean flag=false;
        for(char a:s.toCharArray())
        {
            if(a>='0' && a<='9')
            {
                num=num+a;
                flag=true;
            }
            else
            {
                if(flag)
                {
                    pre=Integer.parseInt(num);
                    System.out.println(temp+" "+pre);
                    if(temp>=pre)return false;
                    num="";
                    temp=pre;
                    flag=false;
                }
            }
        }
        return true;        
    }
    public static void main(String[] args) {
        System.out.println(areNumbersAscending("hello world 5 x 5"));
    }
}