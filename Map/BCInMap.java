import java.util.*;
public class BCInMap
{
    public static void main(String[] args)
    {
        Hashtable ht=new Hashtable();
        ht.put(1,"Rohit");
      //  ht.put(2,"Rohan");
     //   ht.put(null,"Hyder");// here null key & value are not allow
        ht.putIfAbsent(2,"Rohan");

        System.out.println(ht);

        TreeMap tm=new TreeMap();

        //  Integer i=new Integer(5);
        //  tm.put(i,"Rohit")

        tm.put(2,"Rohit");
        tm.put(1,"Ramesh");
        tm.put(4,"Rahul");
        tm.put(3,"Roshan");
        System.out.println(tm);// assending sorted order
    }

}