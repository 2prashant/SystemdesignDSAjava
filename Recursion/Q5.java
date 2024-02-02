public class Q5 
{
    public static void reverse_Number(int num)
    {
        if(num<=0)
        {
            return;
        }
         int x=num%10;
          System.out.print(x+" ");
          reverse_Number(num/10);
    }
      public static void main(String[] args)
      {
            reverse_Number(1234);    
      }

    
       
}
