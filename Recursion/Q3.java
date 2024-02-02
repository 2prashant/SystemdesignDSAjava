//Write a recursive function to print binary of a given decimal number.
import java.util.*;
public class Q3 
{
      public static void binary(int num)
      {
        int x;
            if(num==1 || num==0)
            {
                x=num;
                return;
            }
             x=num%2;
            binary(num/2);
            System.out.print(x+" ");

      }
      public static void main(String[] args)
      {
        
          binary(50);
      }    
}
