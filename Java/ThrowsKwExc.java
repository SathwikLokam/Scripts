import java.io.IOException;  
class ThrowsKwExc{  
  void m(){  
    throw new IOException("device error");//checked exception  
  }  
  void n(){  
    m();  
  }  
  void p(){  
   try{  
    n();  
   }catch(Exception e){System.out.println("exception handled");}  
  }  
  public static void main(String args[]){  
    ThrowsKwExc obj=new ThrowsKwExc();  
   obj.p();  
   System.out.println("normal flow...");  
  }  
}  