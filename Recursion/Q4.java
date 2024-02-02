//9. Write a recursive function to print octal of a given decimal number
public class Q4 
{
         public static void decimal(int num)
         {
             if(num==0 || num==1 || num==2 || num==3 ||num==4 ||num==5 || num==6 || num==7 )
             {
                System.out.print(num);
                return;
             }
             int x=num%8;
             decimal(num/8);
             System.out.print(x);

         }
        public static void main(String[] args)
        {
             decimal(656);    
        }
}
