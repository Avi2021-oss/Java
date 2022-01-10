/** @author Abhirup
*  @version 2.0
*  @since 2021
**/

package javadoc;

/**
 * @author Abhirup 
 * 
 * Class for Library Book
 * 
**/

public class Book {
	/**
	 * Parameterized Constructor
	 * @value 10 default value 
	 * 
	**/
    
	static int val=10;  //static member
	
	/**
	 * @param s Book Name
	 * 
	**/
	
	public Book(String s) {  //constructor
		
	}
	
	/**
	 * Issue a Book to a Student
	 * @param roll no. of a Student
	 * @throws Exception if a book is not available, throws Exception
	**/
	
	public void issue(int roll)throws Exception{   //issue method for book
		
	}
	
	/**
	 * @param str 
	 * @return if book is available return true else false
	**/
	
	public boolean available(String str) {  //checking weather a book is available or not
		return true;
	}
	
	/**
	 * Get Book Name 
	 * @param id book id
	 * @return returns book name
    **/
	
	public String getName(int id) {      //return the name of the book
		return "";
	}
}
