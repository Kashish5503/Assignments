package JalaAssignments;

public class Constructors 
{
	Constructors() { System.out.println("creating a default constructor ");}
	
	int id;  
    String name;  
    //creating a parameterized constructor  
    Constructors(int i,String n)
    {  
    id = i;  
    name = n;  
    }  
    //method to display the values  
    void display(){ System.out.println(id+" "+name); } 
    
	//main method  
	public static void main(String args[])
	{  
	//calling a default constructor 
		Constructors obj = new Constructors();
		Constructors obj1 = new Constructors(1,"Kashish");
		Constructors obj2 = new Constructors(2,"Muskan");
		obj1.display();
		obj2.display();
	}
}
