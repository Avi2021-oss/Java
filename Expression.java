package arithmetic;

import java.lang.*;
import java.util.Scanner;

public class Expression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float base,height,area;
		System.out.println("Enter base and height");
		Scanner sc=new Scanner(System.in);
		base=sc.nextFloat();
		height=sc.nextFloat();
		
		area=base*height/2;
		
		System.out.println("Area of a Triangle is:" + area);

	}

}
