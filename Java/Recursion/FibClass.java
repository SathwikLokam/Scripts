class FibClass
{
    public static int fibOf(int num)
    {
        if(num==0)return 0;
        if(num==1)return 1;
        return fibOf(num-1)+fibOf(num-2);
    }
    public static void main(String[] args) {
        for(int i=0;i<20;i++)
        System.out.print(fibOf(i)+" ");
    }
}