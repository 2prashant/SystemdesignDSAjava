class Human1
{
    private String name;
    int age;
    Human1()
    {
          System.out.println("Human class Constructor");;
    }
    void sleep()
    {
        age=18;
        System.out.println("Human needs good sleep");
        System.out.println(age);
    }
}
class Student1 extends Human1
{
    // public Student1()
    // {
             //super();
    // }
    void disp()
    {
        System.out.println("the age is : "+age);
        //System.out.println("THe Name is : "+name);// private
    }
}
public class basic2
{
       public static void main(String[] args) 
       {
           Student1 s1=new Student1();
           s1.disp();
       }
}
