package JalaAssignments;

public class Exceptions 
{
	static void validate (int age)
	{
		if (age<18) 
			throw new ArithmeticException("Age not valid!"); 
			else
				System.out.println("You can vote.");
	}
	public static void main(String args[])
	{
		// int i = 5/0; Exception in thread "main" java.lang.ArithmeticException: / by zero
		
		/* String s=null;  
		System.out.println(s.length()); NullPointerException */ 
		//Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "s" is null
		
		/* String s="abc";
         int i=Integer.parseInt(s); */ //NumberFormatException
		
		/* int a[]=new int[5];  
           a[10]=50; */ //ArrayIndexOutOfBoundsException 
		
		/* String a = "This is like chipping "; // length is 22
            char c = a.charAt(24); // accessing 25th element
            System.out.println(c); */  //StringIndexOutOfBoundsException
		
		/*  File file = new File("E://file.txt");
            FileReader fr = new FileReader(file); */  //FileNotFoundException
		
		try{  
		      //code that may raise exception  
		      int data=100/0;  
		   }
		catch (ArithmeticException e)
		{
			System.out.println("Arithmetic exception");  //Handling the Arithmetic exception using try-catch block
		} 
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBounds Exception occurs");
		}
		finally 
		{  
			System.out.println("finally block is always executed");  
		}    
		
		validate(17);
		System.out.println("Continue");
	}
}
