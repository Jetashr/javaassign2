package methodshomewrok;
//import java.io.*;

public  class AreaofRectangle {

	    // Java program to find the area of
	    // the rectangle using Method Overloading
        // Overloaded Area() function to
	    // calculate the area of the rectangle
	    // It takes two double parameters
	//    void Area(double l, double w)
	 //   {
	  //      System.out.println("Area of the rectangle: " + l * w);
	   // }
	  
	    // Overloaded Area() function to
	    // calculate the area of the rectangle.
	    // It takes two float parameters
	    void Area(int L, int W)
	    {
	        System.out.println("Area of the rectangle***: " + L * W);
	    }
	
	   public static  void main(String[] args)
	    {
	  
	        // Creating object of Rectangle class
	        AreaofRectangle obj = new AreaofRectangle();
	  
	        // Calling function
	        obj.Area(20, 10);
	      //  obj.Area(10.5, 5.5);
	    }
	}

