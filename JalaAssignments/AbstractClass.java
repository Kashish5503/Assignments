package JalaAssignments;

abstract class Car
{
	abstract void run();
	public void stop() { System.out.println(" Car is Stopped"); }
} 

class Lambho extends Car
{
	void run() { System.out.println(" Car is Running"); }
}

public class AbstractClass 
{
	public static void main(String[] args)
	{
		Car obj = new Lambho();
		obj.run();
		obj.stop();
	}
}
