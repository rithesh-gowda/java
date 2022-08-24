package shape;

public class triangle {
    private double length;
    private double breadth;
       
    public   triangle(double l,double b)
        {
            this.length=l;
            this.breadth=b;
        
                
        }
     public    double tri_area()
                {
                    return ((length*breadth)/2);
                  
                }
    
}
