package JalaAssignments;

public class Operators 
{
	public static void main(String[] args)
	{
		int a = 5;
		int b = 4;
		int sum = a + b;
		int sub = a - b;
		int mult= a * b;
		int div = a / b;
		System.out.println("Sum of a & b is: "+sum);
		System.out.println("Sub of a & b is: "+sub);
		System.out.println("Mult of a & b is: "+mult);
		System.out.println("Div of a & b is: "+div);
		
		int incre = ++a;
		int decre = --b;
		System.out.println("Increment: "+incre);
		System.out.println("Decrement: "+decre);
		
		System.out.println(a == b); //Equal operator
		System.out.println(a != b); //Not Equal operator
		
		/*The logical && operator doesn't check the second condition if the first condition is false. 
		 * It checks the second condition only if the first one is true.*/
		System.out.println(a<b && a>b); // false && true = false
		
		/*The logical || operator doesn't check the second condition if the first condition is true. 
		It checks the second condition only if the first one is false.*/
		System.out.println(a>b || a>b); // true || true = true 
		
		// Logical ! NOT operator inverts the value of a boolean
		System.out.println(!(a>b)); // ! true = false
		
		System.out.println("The largest number of the two numbers is: "+ Math.max(a,b)); //a=6 
		System.out.println("The smallest number of the two numbers is " + Math.min(a,b));//b=3
	}
}
