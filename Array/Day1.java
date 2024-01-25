public class Day1
{
    public static void main(String[] args)
    {
           int []a={10,20,30};
          int []arr=new int[10];
          arr[0]=97;
          arr[1]='a';
          byte b=10;
          arr[2]=b;
          short s=25;
          arr[3]=s;
         // arr[4]=67l;
          System.out.println(arr[0]);
          System.out.println(arr[1]);
          System.out.println(arr[2]);
          System.out.println(arr[3]);
      
           System.out.println("======================");
          Object[] obj=new Object[5];
          obj[0]=new Object();//valid
          obj[1]=new Integer(10);//valid
          obj[2]=new String("sachin");//valid
          for(Object i:obj)
          {
            System.out.println(i);
          }
           
          System.out.println("++++++++++++++++++++");
          Runnable[] r=new Runnable[5];
          r[0]=new Thread("Sachin");
          //r[1]=new String("dhoni"); CE
          //r[2]=new Thread(1); CE
          System.out.println(r[0]);

          int[] arr1={1,2,3};
          char[] c={'a','b','c'};
          int[] arr2=arr1;
          int[] arr3=c;
          System.out.println(arr2);

        int [][] arr4=new int[3][2];

        int [][] arr5=new int[3][];
        arr5[0]=new int[5];
        arr5[1]=new int[3];
        arr5[2]=new int[1];
        arr5[0][0]=10;
        arr5[2][3]=5;

        int [][]arr6={{10,20},{100,200,300},{1000}};
          

    }
  
}