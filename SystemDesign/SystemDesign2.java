public class SystemDesign2
{
    public static void main(String[] args)
    {
        boolean jump=true;
        boolean run=true;
        boolean fly=false;
        boolean weapon=false;
    
        //god mode- All 4 powers
        //legend Mode - Run and Weapon 
        // else Regular Mode
    
        //bad implementation

           if(jump==true)
           {
                if(run==true)
                {
                      if(fly==true)
                      {
                           if(weapon==true)
                           {
                                System.out.println("God mode Actived");
                           }
                      }
                }
           }
           if(run==true)
           {
                if(weapon==true)
               {
                  System.out.println("legend mode Activeted");
               }
           }
           else
           {
                System.out.println("Reghular mode Activated");
           }


        //good implementation
        
        //   if(jump && run && fly && weapon)     
        //   {
        //       System.out.println("Gid mode Activated");
        //   }
        //   else if(run && weapon)
        //   {
        //     System.out.println("Legend mode Actived");
        //   }
        //   else
        //   {
        //      System.out.println("Regular mode Activated");
        //   }
    }
}