public class String3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        String str1="Mr. Shahrukh Khan";
        System.out.println(str1.startsWith("Mr."));
        System.out.println(str1.startsWith("Shah" , 4));
        System.out.println(str1.endsWith("Khan"));
        System.out.println(str1.charAt(4));
        
        for(int i=0;i<str1.length();i++)
            System.out.print(str1.charAt(i));
        
        
        String str2="www.udemy.co.in";
        System.out.println(str2.indexOf("."));
        System.out.println(str2.indexOf(".",4));
        System.out.println(str2.indexOf("udemy"));
        System.out.println(str2.lastIndexOf("."));

	}

}