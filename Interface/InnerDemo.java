// ineer / staic class

// class Person
// {
//     int age;
//     String name;
//     Address add;

//     class Address
//     {
//         String city;
//         String state;
//         int pincode;
//     }
// }


class A
{
    public void show()
    {
        System.out.println("in show");
    }
    // static class B
    class B
    {
        public void display()
        {
            System.out.println("in display");
        }
    }
}
public class InnerDemo 
{
    public static void main(String[] args) 
    {
          A obj=new A();
        //  static// A.B obj1=new A.B();

          A.B obj1=obj.new B();

          obj.show();
          obj1.display();
        
    }    
}
