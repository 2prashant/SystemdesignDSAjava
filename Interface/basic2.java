class Laptop
{
    public void compile()
    {
        System.out.println("You got 5 error");
    }
}
class Developer
{
    public void buildApp()
    {
       System.out.println("Building App");
    }
    Laptop obj=new Laptop();
    obj.compilecode();
}
public class basic2 
{
     public static void main(String[] args) 
     {
         Developer dev=new Developer();
         dev.buildApp();
     }
}
