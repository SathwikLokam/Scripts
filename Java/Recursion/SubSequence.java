public class SubSequence {
    public static void sequence(int idx,String str,int len,String newStr)
    {
        if(idx==len)
        {
            System.out.println(newStr);
            return;
        }
        sequence(idx+1,str , len, newStr+str.charAt(idx));
        sequence(idx+1,str , len, newStr);
        
    }
    public static void main(String[] args) {
        sequence(0, "satf", 4, "");
        
    }
}
