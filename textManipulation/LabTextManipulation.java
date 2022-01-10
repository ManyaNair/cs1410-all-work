package textManipulation;

import java.util.*;
import org.apache.commons.text.*;

public class LabTextManipulation 
{
	public static void main(String[] args)
	{
		ArrayList<String> parks = new ArrayList<String>();
		Scanner q = new Scanner(System.in);
		//find out why while loop isn't working
		
		  while (true)
		  { 
			  System.out.println("Please enter you favorite National Park or DONE to Stop: ");
			  String answer = q.nextLine().toLowerCase();
				 //parks.add(answer); 
				 String input = updateSpelling(answer);
				 parks.add(input);
				 if(answer.equals("done"))
					{ 
					 		q.close();
							break;
					}
			  
		  }		  
		  
		 StringBuilder sb = new StringBuilder();
		 sb.append("Favorite National Parks: ");
		 int i =0;
		 while (i < parks.size()-1)
		 {
			 sb.append(parks.get(i));
			 if(i != parks.size()-2)
			 {
				 sb.append(" | ");
			 }
			 i++;
		 }
		 
		System.out.println(sb.toString());
	}

	public static String updateSpelling(String input)
	{
		try
		{
			String result = WordUtils.capitalize(input);
					//toCamelCase(input,true);
			return result;			
		} catch (Exception e)
		{
			System.out.println(e.toString());
			return "Error.";
		}
	}
	
}
