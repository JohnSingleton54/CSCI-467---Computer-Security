// John M. Singleton
// Deserialize.java finished
// CSCI 476 - Computer Security
// HW2
// resource:  https://www.geeksforgeeks.org/serialization-in-java/

import java.io.*;

class Deserialize implements java.io.Serializable
{
	public static void main(String [] args)
	{
        try
		{	
			String filename = "memorydump.dmp";
        	FileInputStream file = new FileInputStream(filename);
        	ObjectInputStream in = new ObjectInputStream(file);
        	Object data = in.readObject();
			in.close();
			file.close();
        	//System.out.println(data);
			
			CreditCardInfo record1 = (CreditCardInfo) data;
			System.out.println("cardholder name:  " + record1.name);
    	}
		catch(IOException ex)
		{
			System.out.println("IOException is caught");
		}
		catch(ClassNotFoundException ex)
		{
			System.out.println("ClassNotFoundException is caught");
		}
	}
}