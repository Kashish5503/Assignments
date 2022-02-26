package JalaAssignments;

class A {
    public void print_A() { System.out.println("Class A"); }
    void run(){System.out.println("Class A is running");}
}
 
class B extends A {
    public void print_B() { System.out.println("Class B"); }
    void run(){System.out.println("Class B is running");}
}
 
class C extends B {
    public void print_C() { System.out.println("Class C"); }
    void run(){System.out.println("Class C is running");}
}

public class Inheritance 
{
	public static void main(String[] args)
    {
        B obj_B = new B();
        obj_B.print_A();
        obj_B.print_B();
        obj_B.run();
 
        C obj_C = new C();
        obj_C.print_B();
        obj_C.print_C();
        obj_C.run();
    }
}
