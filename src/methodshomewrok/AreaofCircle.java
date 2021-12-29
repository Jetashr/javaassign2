package methodshomewrok;
//import java.io.*;
public class AreaofCircle {

	    static final double PI = Math.PI;
	  
	    // Overloaded Area() function to
	    // calculate the area of the circle.
	    // It takes one double parameter
	    void Area(double r)
	    {
	        double A = PI * r * r;
	  
	        System.out.println("Area of the circle is :" + A);
	    }
	  
	    // Overloaded Area() function to
	    // calculate the area of the circle.
	    // It takes one float parameter
	    void Area(float r)
	    {
	        double A = PI * r * r;
	  
	        System.out.println("Area of the circle is :" + A);
	    }
	
	  
	
	    public static void main(String[] args)
	    {
	  
	        
	        AreaofCircle obj = new AreaofCircle();
	  
	        // Calling function
	        obj.Area(6);
	        obj.Area(3.5);
	    }
	}