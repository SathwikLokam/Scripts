class SumUptoN {
    public static int rec(int num)
    {
           if(num==0)
           {
            return 0;
           }
           return num+rec(num-1);
    }
    
    public static void main(String args[])
    {
        System.out.println(rec(5));
    }
}
