import java.util.*;
public class Insertion_Sort
{
    public static void insertionSort(int []arr)
    {
        for(int i=1;i<arr.length;i++)
        {
              int pivot=arr[i];
              int j=i-1;
              while(arr[j]>pivot && j>=0)
              {
                  arr[j+1]=arr[j];
                  j--;
              }
              arr[j+1]=pivot;
        }
    }
    public static void main(String[] args)
    {
         Scanner obj=new Scanner(System.in);
         System.out.print("Enter Array size : ");
         int size=obj.nextInt();
         System.out.println("Enter array element : ");
         int []arr=new int[size];
         for(int i=0;i<arr.length;i++)
         {
            arr[i]=obj.nextInt();
         }
         insertionSort(arr);
         for(int i=0;i<arr.length;i++)
         {
             System.out.print(arr[i]+" ");
         }

    }
}
