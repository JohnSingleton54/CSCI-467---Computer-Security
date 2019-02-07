// John M. Singleton
// HW2.java finished
// CSCI 476 - Computer Security
// HW2
// resource:  

import java.io.*;
import java.util.Scanner;

class HW2
{
	public static void main(String[] args)
	{
		try
		{
			Scanner fileIn = new Scanner( new FileReader( "memorydump.dmp" ) );
			while( fileIn.hasNextLine( ) )
			{
				String oneLine = fileIn.nextLine( );
				System.out.println( oneLine );
			}
		}
		catch( IOException e )
		{
			System.out.println( e );
		}
	}
}