import java.util.*;
public class iterator_ListIterator
{
    public static void main(String[] args) 
    {
         ArrayList al1=new ArrayList();
         al1.add(10);
         al1.add(20);
         al1.add(30);
         al1.add(100);
         System.out.println(al1);

        //  //for loop
        //  for(int i=0;i<al1.size();i++)
        //  {
        //     Object obj=al1.get(i);
        //     System.out.println(obj);

        //     System.out.println(al1.get(i));
        // }
        //  //for each
        //  for(Object o:al1)
        //  {
        //      System.out.println(o);
        //  }


        // Iterator itr=al1.iterator();
        // while(itr.hasNext())
        // {
        //     //Integer i=(Integer)itr.next();
        //     System.out.println(itr.next());
        // }


        ListIterator litr=al1.listIterator(al1.size());
        while(litr.hasPrevious())
        {
           System.out.println(litr.previous());
        }






    }
}