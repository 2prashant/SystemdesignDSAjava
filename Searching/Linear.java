import java.util.Scanner;
import java.util.*;
public class Linear
{
    public static void main(String[] args)
    {
        System.out.print("Enter Array size:");
        Scanner obj=new Scanner(System.in);
        int size=obj.nextInt();
        System.out.println("Enter element in Array");    
        int []arr=new int[size];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=obj.nextInt();
        }
        System.out.print("Enter Target element : ");
        int target=obj.nextInt();
        // Search element 
        int flag=0;
        for(int i=0;i<arr.length;i++)
        {
             if(arr[i]==target)
             {
                  flag++;
                  break;
             }
        }
        if(flag==0)
        {
            System.out.println("Element is not found");
        }
        else
        {
            System.out.println("Element is found");
        }


    }
}