package smithchart;


import java.awt.Color;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.concurrent.TimeUnit;



public class SmithChart 
{
       static  int sWidth = 700;
       static int sHeight = 700;
      

    public static void main(String[] args) throws InterruptedException
    
   {
    //   Ordinator ord = new Ordinator();
   //    DrawChart d = new DrawChart();
      
//       d.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent we){System.exit(0);}});
//       d.setSize(sWidth,sHeight);
//       d.setBackground(Color.lightGray);
//       d.setVisible(true);
       Menu disp = new Menu();
       disp.show();
//       
//       while(true)
//       {
//           TimeUnit.SECONDS.sleep(1);
//            ord.mouser();
//            
//       
//       }
       

   }
    
}
