class Base
{
    int a=10;
    Base()
    {
        System.out.println("In Base");
    }
    public void base()
    {
        System.out.println("In base method");
    }
}
class Derive extends Base
{
    public void go()
    {
        //super();
        System.out.println(super.a);
        super.base();
        System.out.println(this);
    }
}
class Super
{
    public static void main(String[] args) {
        Derive obj = new Derive();
        obj.go();
    }
}