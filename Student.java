package staticdemo;

import java.util.Date;

class Studnt
{
	private String rollNo;
	private static int count=1;
	
	private String assignRollNo()
	{
		Date d=new Date();
		String rno="Univ-"+(d.getYear()+1900)+"-"+count;
		count++;
		return rno;
	}
	
	Studnt()
	{
		rollNo=assignRollNo();
	}
	
	public String getRollNo()
	{
		return rollNo;
	}
	
}

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Studnt s1=new Studnt();
		Studnt s2=new Studnt();
		Studnt s3=new Studnt();
        
        System.out.println(s1.getRollNo());
        System.out.println(s2.getRollNo());
        System.out.println(s3.getRollNo());

	}

}
