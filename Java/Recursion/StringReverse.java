public class StringReverse {
    private static void reverse(int n,String s)
    {
        if(n==0)return;
        System.out.print(s.charAt(n-1));
        reverse(n-1, s);
    }
    public static void main(String args[])
    {
        reverse(7,"Sathwik");
    }
}
