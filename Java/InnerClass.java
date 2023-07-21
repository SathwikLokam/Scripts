class alpha 
{
    class beta
    {
        public void display()
        {
            System.out.println("innerclass");
        }
    }
}
class InnerClass
{
    public static void main(String[] args) {
        alpha.beta obj=new alpha().new beta();
        obj.display();
    }
}