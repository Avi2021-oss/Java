package interfacedemo;

interface Test
{
	final static int X=10;
	public abstract void math1();
	public abstract void math2();
	
	public static void math3()
	{
		System.out.println("Math3 of Test");
	}
}

interface Test2 extends Test
{
    void math4();
}

abstract class Abc implements Test2
{
    public void math1(){System.out.println("Math1");}
    public void math2(){System.out.println("Math2");}
    public void math4(){System.out.println("Math4");}
}

public class Interface {
	public static void main(String[] args) 
    {
        System.out.println(Test.X);
        Test.math3();
        
    }

}
