package abstractClass;

public class PrinterApp
{

	public static void main(String[] args)
	{
		Printer[] printerObjects = {new InkjetPrinter("Canon TS202"), new LaserPrinter("Samsung Xpress")};
		
		for (int i = 0; i < printerObjects.length; i++)
		{
			System.out.println(printerObjects[i].toString());
			
			for (int j = 0; j < 11; j++)
			{
				printerObjects[i].print();
			}
			System.out.println();
			if(printerObjects[i] instanceof InkjetPrinter)
			{
				((InkjetPrinter)printerObjects[i]).refillCartridge();
			}
			if(printerObjects[i] instanceof LaserPrinter)
			{
				((LaserPrinter)printerObjects[i]).refillToner();
			}
		}
		System.out.println("Remaining cartridge after refilling:" + ((InkjetPrinter)printerObjects[0]).getRemainingCartridge() + "%");
		System.out.println("Remaining toner after refilling:" + ((LaserPrinter)printerObjects[1]).getRemainingToner()+ "%");
		
	}

}
