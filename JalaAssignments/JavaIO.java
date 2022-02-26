package JalaAssignments;

import java.io.*;

public class JavaIO 
{
	public static void main(String args[])
	{
		try{    
            FileInputStream fin=new FileInputStream("D:\\HelloWorld.txt");    
            int i=0;    
            while((i=fin.read())!=-1){    
             System.out.print((char)i);            
            }        
  
            fin.close();    
          }
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println();
		
		try{    
            FileOutputStream fout=new FileOutputStream("D:\\Blank.txt");    
            String s="Kashish Goyal.";    
            byte b[]=s.getBytes();//converting string into byte array    
            fout.write(b);    
            fout.close();    
            System.out.println("success...");    
           }
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		 try{    
			    FileInputStream fin=new FileInputStream("D:\\Blank.txt");    
			    BufferedInputStream bin=new BufferedInputStream(fin);    
			    int i;    
			    while((i=bin.read())!=-1){    
			     System.out.print((char)i);    
			    }    
			    bin.close();    
			    fin.close();    
			  }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
		 System.out.println();
		 
		 
		 try {
			  FileReader fr = new FileReader("D:\\\\HelloWorld.txt");
			 int i;
			 while ((i = fr.read()) != -1) {
				 System.out.print((char)i);
			 }
		 }
		catch(Exception e)
		{
			System.out.println(e);
		}
		 System.out.println();
		 
		 try {
			 File file = new File("D:\\\\Blank.txt");
			 BufferedReader br = new BufferedReader(new FileReader(file));
			 String st;
			 while ((st = br.readLine()) != null)
				 System.out.println(st);
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
	}
}
