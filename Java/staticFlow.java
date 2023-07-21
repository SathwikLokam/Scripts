class alpha
{
static int a=10;
void get()
{
int a=20;
System.out.println(this.a);// static a ie 10
System.out.println(a);     // local a ie 20
}
}
class beta
{
public static void main(String args[])
{
alpha obj=new alpha();
obj.get();
System.out.println(alpha.a); // static a ie 10
}
}