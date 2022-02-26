package JalaAssignments;

class L
{
	int l = 4;
	void m() { System.out.println("KG"); }
}

class M extends L
{
	int l = 5;
	void printInt() 
	{ 
		this.m(); 
		System.out.println(l);        //prints int l of class M
		System.out.println(super.l);  // prints int l of Class L
	}
}

public class ThisAndSuper 
{
	int x;

	  // Constructor with a parameter
	  public ThisAndSuper(int x) 
	  {
	    this.x = x;
	  }

	  // Call the constructor
	  public static void main(String[] args) 
	  {
		  ThisAndSuper myObj = new ThisAndSuper(5);
	    System.out.println("Value of x = " + myObj.x);
	    
	    M obj = new M();
	    obj.printInt();
	  }
}
