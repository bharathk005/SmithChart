
package smithchart;


import java.awt.MouseInfo;



public class Ordinator 
{
    SmithChart ch = new SmithChart();
    int width = ch.sWidth;
    int height = ch.sHeight;
    float xm,ym,r,i;
    
    public float xy2r(float x, float y)
    {   
        x = x/(width/2)-1;y=1-y/(height/2);
        return (float)(2*(1-x)/(Math.pow(x-1,2)+Math.pow(y,2))-1);
    
    }
    public float xy2i(float x,float y)
    {
        x = x/(width/2)-1;y=1-y/(height/2);
        return (float)(2*y/(Math.pow(x-1,2)+Math.pow(y,2)));
        
    }
    
    public float ir2x(float rval,float ival)
    {
       float x;
       x =(float)(1-(2/((rval+1)*(1+(Math.pow(ival,2)/Math.pow(rval+1,2))))));
       //return (x+1)*width/2;
       return x;
    }
    
    public float ir2y(float rval,float ival)
    {
        float y ;
        y= (float)(ival*(2/((rval+1)*(1+(Math.pow(ival,2)/Math.pow(rval+1,2)))))/(rval+1));
        //return (1-y)*height/2;
        return y;
    }
    
    
    public void mouser()
    {   
        
 //       xm = (float)MouseInfo.getPointerInfo().getLocation().getX();
 //       ym = (float)MouseInfo.getPointerInfo().getLocation().getY();
        r = xy2r(xm, ym);
        i = xy2i(xm,ym);
//        System.out.print("\nMouse X: "+xm);
//        System.out.print("\nMouse Y: "+ym);
//        System.out.print("\nR val : "+r);
//        System.out.print("\ni val: "+i);
    }
    
    
    
}
