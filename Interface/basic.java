interface A
{
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
        System.out.println("in show");
    }
    public void abc()
    {
        System.out.println("in abc");
    }
}
public class basic
{
    public static void main(String arg[])
    {
         A obj=new B() ;
         obj.show();
         
    }
}
