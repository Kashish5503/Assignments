package JalaAssignments;
import java.util.*;

public class Loops 
{
	public static void main(String[] args)
	{
		//Write a program to print “Bright IT Career” ten times using for loop.
		for (int i = 1; i <= 10; i++)
		{
			System.out.println("Bright IT Career");
		}
		
		//Write a java program to print 1 to 20 numbers using the while loop.
		int k = 1;
		while( k <= 20)
		{
			System.out.println(k);
			k++;
		}
		
		//Write a program to print the odd and even numbers.
		for(int p = 1; p <= 10; p++)
		{
			if(p % 2 == 0)
				System.out.println("Even numbers: "+p);
			else
				System.out.println("Odd numbers: "+p);
		}
		
		//Write a program to print even number between 10 and 100 using while.
		int e = 10;
		System.out.println("Even Number b/t 10 to 100: ");
		while( e <= 100) {
			System.out.println(e);
		e = e + 2;
		}
		
		//Write a program to print 1 to 10 using the do-while loop statement.
		int d = 1;
		System.out.println("print 1 to 10 using the do-while loop statement: ");
		do {
			System.out.println(d);
			d++;
		}while(d <= 10);
		
		//Write a program to find Armstrong number or not.
		//This program correctly works for 3 digit numbers only.
				// Examples of armstrong number = 0,1,153,370,371 etc.
				//153: 1+ 125+ 27 = 153
		int n, temp, sum = 0, r=0;

	      Scanner sc = new Scanner(System.in);
	      System.out.println("Input a number to check if it is an Armstrong number: ");      
	      n = sc.nextInt();

	      temp = n;

	      while(temp>0)
			{
				r = temp % 10 ;
				sum = sum + (r *r * r);
				temp = temp/10;	
			}

	      if (sum == n)
	         System.out.println(n + " is an Armstrong number.");
	      else
	         System.out.println(n + " is not an Armstrong number.");
	      
	      //Write a program to palindrome or not.
	      int t, summ=0, tempp;    
	      int nn = 454;//It is the number variable to be checked for palindrome  
	      
	      tempp = nn;    
	      while(nn > 0){    
	       t = nn % 10;  //getting remainder  
	       summ = (summ*10)+t;    
	       nn = nn/10;    
	      }    
	      if(tempp==summ)    
	       System.out.println("Palindrome Number");    
	      else    
	       System.out.println("Not Palindrome");
	      
	      //Program to check whether a number is EVEN or ODD using switch.
	      int eo;
	      Scanner scc = new Scanner(System.in);
	      System.out.println("Input a number to check if it is Even or Odd number: ");
	      eo = scc.nextInt();
	      switch(eo % 2) //this will return 0
	      {
	      case 0:
	          System.out.println(eo+" is an Even number");
	          break;
	      case 1:
	          System.out.println(eo+" is an Odd number");
	          break;
	       }
	      
	      //Print gender (Male/Female) program according to given M/F using switch.
	      int mf;
	      Scanner scn = new Scanner(System.in);
	      System.out.println("Enter m or f: ");
	      mf = scn.next().charAt(0);
	      switch(mf){ 
			case 'm': 
				System.out.println("Gender is male"); 
				break; 
			case 'f': 
				System.out.println("Gender is female"); 
				break; 
			} 
	      
	      //Program for multiple if else statement(Largest number in 10,20 and 30)
	      int s=10 , m=20 , l=30;
	      if(s > m && s > l)
	    	  System.out.println(s + " is the largest number.");
	      else if(m > s && m > l)
	    	  System.out.println(m + " is the largest number.");
	      else
	    	  System.out.println(l + " is the largest number.");
	}
}
