import java.io.IOException;  
class ThrowsKw{  
  void m()throws Exception
  {  
    throw new IOException("device error");//checked exception  
  }  
  void n()throws Exception
  {  
    m();  
  }  
  void p()
  {  
    try
    {  
      n();  
    }
   catch(Exception e)
   {
    System.out.println("exception handled");
   }  
 }  
  public static void main(String args[]){  
    ThrowsKw obj=new ThrowsKw();  
   obj.p();  
   System.out.println("normal flow...");  
  }  
}  