package methodshomewrok;
//import java.lang.*;
//import java.io.*;
public class VolumeofBox {

	
			int length, breadth, height;
			VolumeofBox(int l,int b,int h)
			{
				length=l;
				breadth=b;
				height=h;
		//	System.out.println("Length is:" + length);
			}
			public void display()
			{
				int volume=length*breadth*height;
				System.out.println("Volume of Box is:"+volume);
			}
	//	}
	//import BoxPackage.*;
	//class Boxdemo
	//{
		public static void main(String args[])
		{
			VolumeofBox b=new VolumeofBox(10,20,30);
			b.display();
		}
	
	}

//input.close();
