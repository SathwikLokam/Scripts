public class countCharacters {
    public static int count=0;
    private static void countChar(char ch,char[] arr,int len)
    {
        if(len==0)
        {
            System.out.println(count);
            return;
            
        }
        if(arr[len-1]==ch)count++;
        countChar(ch, arr, len-1);
    }
    public static void main(String[] args) {
        char[] arr="saddssassasdaa".toCharArray();
        countChar('s', arr,arr.length);
}
}
