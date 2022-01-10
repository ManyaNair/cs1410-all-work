package m05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Module05
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List<String> quoteLine = new ArrayList<String> ();
		
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("C:\\Users\\manya\\eclipse-workspace\\1410_Module05\\src\\m05\\Resources\\Quote.txt"));
			String line;
			while((line = br.readLine())  != null) {
				quoteLine.add(line);
			}
			br.close();
		}
		catch(IOException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		quoteLine.forEach(i -> {System.out.println(i);});
		
		System.out.println("\n" + "With caps" + "\n");
		
		int j = 0;
		int x = 1;
		List<String> capsQuote = new ArrayList<String> ();
		while(j < quoteLine.size()) 
		{
			if(j < 9)
			{
				if(j % 2 == 0)
				{
					//System.out.println("0" + x + " " + quoteLine.get(j).toUpperCase());
					capsQuote.add("0" + x + " " + quoteLine.get(j).toUpperCase());
				}
				else
				{
					//System.out.println("0" + x + " " + quoteLine.get(j).toLowerCase());
					capsQuote.add("0" + x + " " + quoteLine.get(j).toLowerCase());
				}
			}
			else 
			{
				if(j % 2 == 0)
				{
					//System.out.println(x + " " + quoteLine.get(j).toUpperCase());
					capsQuote.add(x + " " + quoteLine.get(j).toUpperCase());
				}
				else
				{
					//System.out.println(x + " " + quoteLine.get(j).toLowerCase());
					capsQuote.add(x + " " + quoteLine.get(j).toLowerCase());
				}
			}
			x++;
			j++;
		}
		capsQuote.forEach(i -> {System.out.println(i);});
		
		//write contents to Quote2
		try
		{
			FileWriter file = new FileWriter("C:\\Users\\manya\\eclipse-workspace\\1410_Module05\\src\\m05\\Resources\\Quote2.txt");
			BufferedWriter readFile = new BufferedWriter(file);
			
			for(String str: capsQuote)
			{
				readFile.write(str + "\n" + "\n");
			}
			readFile.close();
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
	}

}
