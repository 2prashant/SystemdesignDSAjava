//Write a recursive function to print first N odd natural numbers
import java.util.*;
public class Q2 
{
    public static void oddnum(int num)
    {
         if(num<0)
         {
            return;
         }
         oddnum(num-1);
         System.out.print(2*num+1+" ");
    }

     public static void main(String[] args) 
     {
          Scanner Input=new Scanner(System.in) ;
          System.out.print("Enter NUmber:");
          int num=Input.nextInt();
          oddnum(num);
     }    
}
