import java.lang.*;
import java.util.Scanner;

public class Cuboid {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int l, b, h;
		int totalArea, Volume;
		
		System.out.println("Enter length, breadth and height");
		l=sc.nextInt();
		b=sc.nextInt();
		h=sc.nextInt();
		
		totalArea=2*(l*b + l*h + b*h);
		
		Volume = l*b*h;
		
		System.out.println("Total Area" + totalArea);
		System.out.println("Volume" + Volume);
		
	}

}