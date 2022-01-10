package arithmetic;

public class Bitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0b1;
		int y;
		y=x<<1;
		
		System.out.println(y);
		
		int a=10, b=15;
	      
	      a=a^b;
	      b=a^b;
	      a=a^b;
	      
	      System.out.println(a+ " "+b);
	    
	    
	      byte c;
	      
	      c=(byte)(9<<4);
	      c=(byte)(c|12);
	      
	      System.out.println((c&0b11110000)>>4);
	      System.out.println((c&0b00001111)>>4);

	}

}
