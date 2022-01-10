package staticdemo;

class Abc
{
	public final void show()
	{
		System.out.println();
	}
}

class Test1 extends Abc
{
	//public void show(){}
    //gives error as final methods cannot be overloaded.
}

public class FinalDemo {
	
final float PI;
    
    public FinalDemo()
    {
        PI=3.1425f;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final float PI;
        PI=3.1425f;
        System.out.println(PI);

	}

}
