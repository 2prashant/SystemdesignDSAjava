interface A
{
    int num=6;
    void show();
}
class B implements A
{
     public void show()
     {
          System.out.println(" in show ");
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
