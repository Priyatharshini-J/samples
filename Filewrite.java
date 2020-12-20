
import java.util.*;
import java.lang.*;
import java.io.*;

public class Filewrite
{
	public static void main(String[] args)
	{
		File file = new File("/Users/priya-8673/Desktop/java/samples/writefile.txt");
		boolean result;
		try
		{
			result = file.createNewFile();
			if(result)
			{
				System.out.println("File successfully created in :" + file.getCanonicalPath());
				try
				{
				FileOutputStream fos = new FileOutputStream("writefile.txt", true);
				System.out.println("Enter the contents of the file : ");
				Scanner scan = new Scanner(System.in);
				String str = scan.nextLine();
				byte[] b = str.getBytes();
				fos.write(b);
				fos.close();
				System.out.println("File written successfully.");
				}
				catch(Exception e)
				{
					System.out.println("Error in file writing : " + e);
				}
			}
			else
			{
				System.out.println("File is already located in the location : " + file.getCanonicalPath());
			}
		}
		catch(IOException e)
		{
			System.out.println("Error in file createion : " + e);
		}
	}
}