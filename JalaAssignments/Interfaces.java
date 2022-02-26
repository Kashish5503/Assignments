package JalaAssignments;

interface F
{
	void print();
}
interface H
{
	void show();
}
interface I extends F
{
	void print();	
}

class G implements F,H
{
	public void print(){ System.out.println("Hello"); }
	public void show() { System.out.println("World"); }
}
class J implements I
{
	public void print(){ System.out.println("Kashish"); }
	private void privateMethod() { System.out.println("Private Method"); }
	public static void show() { System.out.println("Static Method"); }
}

public class Interfaces 
{
	public static void main(String[] args)
	{
		G obj = new G();
		obj.print();
		obj.show();
		
		J obj2 = new J();		
		obj2.print();
		obj2.show();
	}
}
