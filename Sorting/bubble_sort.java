import java.util.*;
import java.util.Scanner;
public class bubble_Sort
{
    public static void  bubbleSort(int []arr,int size)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                  if(arr[i]>arr[j])
                  {
                      int temp=arr[i];
                      arr[i]=arr[j];
                      arr[j]=temp;
                  }
            }
        }
    }
    public static void main(String[] arg)
    {
         Scanner obj=new Scanner(System.in);
         System.out.print("Enter Array Size : ");
         int size=obj.nextInt();
         int []arr=new int[size];
         for(int i=0;i<arr.length;i++)
         {
              arr[i]=obj.nextInt();
         }
         bubbleSort(arr,size);
         for(int i=0;i<arr.length;i++)
         {
              System.out.print(arr[i]+" ");
         }



    }

}