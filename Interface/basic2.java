interface  Computer
{
    void compilecode();
    
}
class Laptop implements Computer
{
    public void compilecode()
    {
        System.out.println("You got 5 error");
    }
}
class Desktop implements Computer
{
      public void compilecode()
      {
          System.out.println("You got 5 errors, faster");
      }
}
class Developer
{
    public void buildApp(Computer obj)
    {
       System.out.println("Building App");
       obj.compilecode();
    }
}

public class basic2 
{
     public static void main(String[] args) 
     {
      //  Laptop obj=new Laptop();
      //   Desktop obj=new Desktop();
          Computer obj=new Desktop();
         Developer dev=new Developer();
         dev.buildApp(obj);
     }
}
