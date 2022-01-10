package nestedinner;

class GFC
{
	int x=10;
	static int y=20;
	
	static class Abc
	{
		public void show()
		{
			System.out.println(y);
		}
	}
	
}
public class LocalInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GFC.Abc a=new GFC.Abc();
		a.show();

	}

}
