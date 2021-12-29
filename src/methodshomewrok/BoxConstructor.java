package methodshomewrok;

public class BoxConstructor {
        
	    int width, height, depth;
	   // constructor used when all dimensions specified
	    
	   void Box(int w, int h, int d)
	    {
	        width = w;
	        height = h;
	        depth = d;
	    }
	  
	    // constructor used when no dimensions
	    // specified
	  void  Box()
	    {
	        width = height = depth = 0;
	    }
	  
	    // constructor used when cube is created
	   void Box(int len)
	    {
	        width = height = depth = len;
	    }
	  
	    // compute and return volume
	   void Volume(int l, int w, int b)
	    {
	        System.out.println("Volume of the box: " + l * w * b);
	     
	    }
	
	   void Volume1(double l, double w, double b)
	    {
	        System.out.println("Volume of the box: " + l * w * b);
	    }

    public static void main(String[] args)
    {
        // create boxes using the various
        // constructors
    	//int Vol;
    	BoxConstructor box1 = new BoxConstructor();
    	BoxConstructor box2 = new BoxConstructor();
    	BoxConstructor box3 = new BoxConstructor();
   	    	
      box1.Volume(1,2,3);
      box2.Volume1(1.1,2.1,3.1);
      box3.Volume(10,20,30);
      
        
    }
}