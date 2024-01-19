import java.util.*;
public class Priorty_Queue 
{
     public static void main(String[] args)
     {
        PriorityQueue pq=new PriorityQueue();
        // its follow minheap data structure.
         pq.add(100);
         pq.add(50);
         pq.add(150);
         pq.add(25);
         pq.add(75);
         pq.add(125);
         pq.add(175);
         System.out.println(pq);
         pq.add(25);
         System.out.println(pq);

     }
}
