//Write a recursive function to print first N natural numbers
import java.util.*;
public class Q1
{
    public static void naturalnum(int num)
    {
        if(num==0)
        {
            return;
        }
        naturalnum(num-1);
        System.out.print(num+" ");
    }
    public static void main(String[] args)
    {
        Scanner Input=new Scanner(System.in);
        System.out.println("Enter number : ");
        int num=Input.nextInt();
        naturalnum(num);
        

    }

}