
class RunnableThread 
{
    public static void main(String[] args)
    {
        Alpha ob=new Alpha();
        ob.x.start();

    }
}
class Alpha implements Runnable
{
    public Thread x;
    Alpha()
    {
        x=new Thread(this,"thread1");
    }
    public  void run()
    {
        System.out.println("iam a thread");
    }
}