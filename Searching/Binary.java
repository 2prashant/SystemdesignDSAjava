import java.util.Scanner;

public class Binary 
{
      public static int search(int []arr,int low,int heigh,int target)
      {
           int mid=low+(heigh-low)/2;
           while(low<=heigh)
           {
               if(target==arr[mid])
               {
                     return mid;
               }
               else if(target > arr[mid])
               {
                    low=mid+1;
               }
               else 
               {
                  heigh=mid-1;
               }
                mid=low+(heigh-low)/2;
           }
           return -1;
      }
      public static void main(String[] args)
      {
           System.out.print("Enter Array size : ");
           Scanner obj=new Scanner(System.in);
           int size=obj.nextInt();
           int[] arr=new int[size];
           for(int i=0;i<arr.length;i++)
           {
               arr[i]=obj.nextInt();
           }
           System.out.print("Enter target Element : ");
           int target=obj.nextInt();
          int x=search(arr,0,size,target);
          if(x==-1)
          {
              System.out.println("Element is not found");
          }
          else
          {
              System.out.println("Element is found at index : "+x);
          }

      }    
}
