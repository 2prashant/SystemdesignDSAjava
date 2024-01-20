import java.util.*;
public class hashmap_LinkedHashMap
{
    public static void main(String[] args) 
    {
        HashMap hm1=new HashMap();
        hm1.put(01,"virat");
        hm1.put(02,"Rohit");
        hm1.put(03,"rohan");
        hm1.put(null,null);
        hm1.put(04,"rohan");
        hm1.put(04,"rohan");
        hm1.put("ram","ram");
        System.out.println(hm1);

        LinkedHashMap hr=new LinkedHashMap();
        hr.put("virat","rohit");
        hr.put("rohit","roshan");
        hr.put('k','a');
        System.out.println(hr);


    }
}