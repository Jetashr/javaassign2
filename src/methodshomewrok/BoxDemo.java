package methodshomewrok;
class Box
{
	    double width;
	    double height;
	    double depth;
    /* this is the constructor for the Box */
    Box()
    {
         width = 100;
        height = 10;
        depth = 50;
    }
    
    /* calculate and return the volume */
    double volume()
    {
        return width * height * depth;
    }
}
public class BoxDemo {

	public static void main(String[] args) {
		
		/* declare, allocate, and initialize the Box objects */
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        Box mybox3= new Box();
        double vol;
        
       
        vol = mybox1.volume();
        System.out.println("Volume of the first box is " + vol);
        
       
        vol = mybox2.volume();
        System.out.println("Volume of the second box is " + vol);
        
        vol= mybox3.volume();
        System.out.println("Volume of the third box is " + vol);
	}

}
