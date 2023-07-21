class Multithreads extends Thread
{
public void show()
{
for(int i=0;i<3;i++)
System.out.println(Thread.currentThread().getName()+"running");
}
 public void run()
{
show();
}
public static void main(String args[])
{
for(int i=0;i<10;i++){
new Multithread().start();
}
}
}