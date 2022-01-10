package annodemo;

import java.lang.annotation.*;

class Parent
{
	public void display() {}
}

class Child extends Parent
{
	@Override
	public void display() {
		
	}
}

class OldClass
{
	public void display()
	{
		System.out.println("Hello");
	}
	
	@Deprecated
	public void show()
	{
		System.out.println("Hi");
	}
}

class My<T>
{
	@SafeVarargs
	private void show(T...arg)   //variable argument method generic types
	{
		for(T x:arg)
			System.out.println(x);
	}	
}

@FunctionalInterface
interface Abc
{
	public void show();
	
}

@interface MyAnno
{
	String name();
	String project();
	String date();
	float version();
}

@MyAnno(name="Sam",project="bank",date="1/2/2018",version=15)  //metadata
public class Annotation {

	int data;
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OldClass oc=new OldClass();
		oc.show();
		
		int x;

	}

}
