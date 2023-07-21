import javax.swing.plaf.synth.SynthSpinnerUI;

public class MaxPro {
    public static int prod(int[] arr,int idx,int pro,int len,int max)
    {
        if(idx==len)
        {
            if(max<pro)max=pro;
            return max;
        }
        return Math.max(prod(arr,idx+1,pro*arr[idx],len,max),prod(arr,idx+1,pro,len,max));
    }
    public static void main(String[] args) {
        int arr[]={1,7,2,3,8};
        System.out.println(prod(arr,0,1,5,Integer.MIN_VALUE));
    }

}
