package JalaAssignments;

class D
{
	private int k = 45;
	private void msg() { System.out.println("Private Class"); }
}

class P
{
	protected int kk = 4;
	protected void mssg() { System.out.println("Protected Class"); }
}
class E
{
	int kg = 5;
	void msgg(){ System.out.println("Defualt Class"); }  
}  
public class AccessModifiers 
{	
	public static void main(String[] args)
	{
		//Private 
		D obj = new D();
		/*obj.msg();    Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	                    The method msg() from the type A is not visible
	                     at JalaAssignments.AccessModifiers.main(AccessModifiers.java:13)*/	
		
		//Protected
		P obj1 = new P();
		//The protected access modifier is accessible within package and outside the package but through inheritance only.
		System.out.println(obj1.kk); 
		obj1.mssg();
		
		//Default
		E obj2 = new E();
		System.out.println(obj2.kg);
		obj2.msgg();						
	}
}
