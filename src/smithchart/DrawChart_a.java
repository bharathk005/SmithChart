
package smithchart;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class DrawChart_a extends Frame
{
     int x;int r;int y;
  
    SmithChart sh = new SmithChart();
    int height = sh.sHeight;
    int width = sh.sWidth;
    int cx = width;int cy = height/2;
    int admit = 1;
    public void paint(Graphics g) 
    {
        Graphics2D gd = (Graphics2D)g;
   
  
        
    gd.setPaint(Color.BLACK);
     for (double i =1;i <10;i=i+0.5)
     {
        x = cx-r/2;
        y = cy-r/2;
        gd.drawOval(x,y,r,r);       // r is 2*radius
        cx = cx - (int)Math.pow(2,i);
        r = 2*(width - cx);
     }
     gd.setPaint(Color.RED);
     x = width/2;y=height/4;r=width/2;
     gd.drawOval(x,y,r,r);
     cx = width;cy=height/2;r=0; 
     gd.setPaint(Color.BLACK);
     for (int i =1;i <12;i=i+1)
     {
        x = cx-r/2;
        y = cy-r/2;
        gd.drawOval(x,y,r,r);       // r is 2*radius
        cy = cy - (int)Math.pow(2,i);
        r = 2*(height/2-cy);
     }
    cx = width;cy=height/2;r=0; 
     for (int i =1;i <12;i=i+1)
     {
        x = cx-r/2;
        y = cy-r/2;
        gd.drawOval(x,y,r,r);       // r is 2*radius
        cy = cy + (int)Math.pow(2,i);
        r = 2*(cy-height/2);
     }
     gd.setPaint(Color.lightGray);
     for(int x =0;x<width;x++)
         for(int y =0;y<height;y++)
         {
               if((Math.pow(x-width/2,2)+Math.pow(y-height/2,2)>Math.pow(width/2,2)))
               {
                   gd.drawOval(x,y,1,1); 
               }
         }
     
     gd.setPaint(Color.RED);
     x = 0;y=0;r=width;
     gd.drawOval(x,y,r,r);
     gd.drawLine(0,height/2 , width, height/2);
     
  

    
    }
}
