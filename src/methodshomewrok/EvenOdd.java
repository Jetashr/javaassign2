package methodshomewrok;
import java.util.Scanner;
public class EvenOdd
    {
	
	public static boolean evenodd(int m) //method definition
	{
		boolean n = true;
		boolean o = false;
				int p= m%2;
					
    if  (p == 0)	
    		return n;			
	else		
	return o;
	}
	
	
	public static void main (String args[])
	{
	Scanner input=new Scanner(System.in);
	System.out.print("Enter the number : ");
	int num=input.nextInt();
	boolean s= evenodd(num);
	System.out.print("number is even : " + s);
	input.close();
	}
	
    
//input.close();
}


/*public static void main(String args []){
    Scanner input = new Scanner(System.in);
    int number;
    int i;
    int a;

    System.out.println("Enter number");
    number = input.nextInt();

    for(i = 1; i < (number + 1); i++){
        if(number % i==0){
            a++;
        }
    }

    System.out.println(prime(m));
}

public static boolean prime(boolean m){
    boolean m = false;

    if(a!=2){
        return m;
    }else{
        return m = true;
    } 
}*/