
import java.util.*;
public class Array_List
{
    public static void main(String[] args)
    {
         ArrayList al1=new ArrayList();
         al1.add(100);
         al1.add(200);
         al1.add(300);
         System.out.println(al1);
         al1.clear();
         System.out.println(al1);
         System.out.println();

         ArrayList al2=new ArrayList();
         al2.add("PW skills");
         al2.add(1);
         al2.add("j");
         al2.add(1.1);
         System.out.println(al2);

         ArrayList al3=new ArrayList();
         al3.add(100);
         al3.add(200);
         al3.add("pw");
         al3.add("pwSkill");
         al3.add(2,220);
         al3.addAll(al2);
         System.out.println(al3);
         al3.add(1,100);
         System.out.println(al3);
         System.out.println(al3.contains(100));
         int index=al3.indexOf(1);
         System.out.println(index);
         System.out.println(al3.size());
         al3.ensureCapacity(20);
         System.out.println(al3.size());
         al3.trimToSize();
         System.out.println(al3.size());


         List al4=new ArrayList();
         al4.add(9.8);
         System.out.println(al4);




        



    }
}