import java.util.Scanner;

public class AssociativeProperty {
	
	private int x;
	private int y;
	private int z;
	
	public AssociativeProperty(int num1, int num2, int num3)
	
	{
		x = num1;
		y = num2;
		z = num3;
	}
	
	
	public int firstTwo()
	
	{
		return (x*y)+z;
		
	}
	
	public int lastTwo()
	{
		return (x*y)+z;
		
	}
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first integer");
		int x = input.nextInt();
		
		System.out.println("Enter second integer");
		int y = input.nextInt();
		
		System.out.println("Enter third integer");
		int z = input.nextInt();	
		
		input.close();
		
		AssociativeProperty ap = new AssociativeProperty(x,y,z);
	    
	    System.out.println("Grouping the first two terms,(" + x + " + " + y + ") * " + z + " = " + ap.firstTwo());
	    
	    System.out.println("Grouping the last two terms, " + x + " + (" + y + " * " + z + ") = " + ap.lastTwo());
		
	}
	
	
}
