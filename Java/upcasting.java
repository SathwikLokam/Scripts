class cl1
{
void add()
{
System.out.println("class cl1");
} 
}
class cl2 extends cl1
{
public static void main(String args[])
{
cl1 obj=new cl2();
obj.add();
}
}