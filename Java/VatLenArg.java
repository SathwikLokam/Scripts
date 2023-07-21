public class VatLenArg {
    static void add(int...a)
    {
        int sum=0;
        for(int x : a)
        {
            sum+=x;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        add(10,34,45,5,46,45,646,6);
    }
}