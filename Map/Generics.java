import java.util.*;
public class Generics
{
     public static void main(String[] args) 
     {

        // //typesafety
        //  String ar[]=new String[10];
        //  ar[0]="Hyder";
        //  ar[1]="pw";
        // // ar[2]=10; CE

        // String name1=ar[0];
        // String name2=ar[1];

        //No typesafety
        // ArrayList al=new ArrayList();
        // al.add("Hyder");
        // al.add("pw");

        // al.add(10);

        // String n1=(String)al.get(0);//tyoecasting
        // String n2=(String)al.get(1);
        // String n3=(String)al.get(2);


        // No typesafety
        //typeSefty Achived using Generics
        ArrayList<String> al=new ArrayList<String>();
        al.add("Hyder");
        al.add("pw");

       // al.add(10);

        // String n1=(String)al.get(0);//tyoecasting
        // String n2=(String)al.get(1);
      //  String n3=(String)al.get(2);

          String name1=al.get(0);
          String name2=al.get(1);
     }
}

