import java.util.*;

class Employee
{
    private String name;
    private int empId;

      public Employee(String name,int empId)
      {
           this.name=name;
           this.empId=empId;
       }
       public String toString()
       {
            return empId + "";
       }

       @Override
       public void finalize()
       {
          
            System.out.println("clean up work by GC before de allocating memoery from heap");
       }

  


}

public class HM_Vs_WHM 
{
     public static void main(String[] args) 
     {
           Employee e=new Employee ("Hyder",171);

        //    HashMap hm=new HashMap();// HashMap deomenate compare to Garbage collector
        //    hm.put(e,"Hyder");
        //    System.out.println(hm);


        //    WeakHashMap hm=new WeakHashMap();// HashMap not deomenate Compare to Garbage Collector
        //    hm.put(e,"Hyder");
        //    System.out.println(hm);

           e=null;//eligible for garbage Collection

           System.gc();//invocking garbage collector

            System.out.println(hm);

           System.out.println("Last Line");
     }    
}
