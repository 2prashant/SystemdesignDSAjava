interface A
{
    int num=6;
    void show();
}
interface x
{
    
    void abc();
    
}
class B implements A,x
{
     public void show()
     {
          System.out.println(" in show ");
     }
     public void abc()
     {
        System.out.println("in abc");
     }
}
public class basic3 
{
    public static void main(String[] args)
    {
        
        System.out.println(A.num);
        B obj=new B();
        obj.show();
    }

}
