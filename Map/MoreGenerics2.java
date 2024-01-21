import java.util.*;

class Gen<T>
{
      T obj;

      public Gen(T obj)
      {
          this.obj=obj;
      }

      void disp()
      {
          System.out.println("THe type of data is : "+obj.getClass().getName());
      }
      public T getobj()
      {
        return obj;
      }
}
public class MoreGenerics2 
{
        public static void main(String[] args) 
        {
               
               Gen<Integer> g=new Gen<Integer>(10);
                g.disp();
                System.err.println(g.getobj());

                System.out.println("=============================");
                 
                Gen<String> g1=new Gen<String>("Hello");
                g1.disp();
                System.out.println(g1.getobj());


            //    ArrayList<Gen> list1=new ArrayList<Gen>();

            //   ArrayList<String> list12=new ArrayList<String>();

            //   List<String> list2=new ArrayList<String>();

            //   Collection<Integer> list3=new ArrayList<Integer>();

            //  // List<Object> list4=new ArrayList<String>();//CE

            //  List<Integer> list5=new ArrayList<Integer>();

            // List<int> list6=new ArrayList<int>();

        }
}
