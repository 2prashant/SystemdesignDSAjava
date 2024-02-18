class human
{
    private String name;
      int age;
      public void sleep()
      {
         age=18;
        System.out.println("human need good sleep");
        System.out.println(age);

    }
}
class student extends human
{

}
public class basic
{
    public static void main(String[] args)
    {
        student s1=new student();
        s1.sleep();
    }
}