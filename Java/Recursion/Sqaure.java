public class Sqaure {
    public static int power(int b,int e)
    {
        if(e==1)return b;
        return b*power(b,e-1);
    }

    //power of n according to the e is even or odd
    public static int powerLogN(int b,int e)
    {
        if(e==0)return 1;
        if(e>=2)
            return b*b*powerLogN(b, e-2);
        else 
            return b;
    }
    public static void main(String[] args) {
        System.out.println(power(2,12));
        System.out.println(powerLogN(2, 12));
    }
}
