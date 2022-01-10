package abstractClass;

public class InkjetPrinter extends Printer
{

	public InkjetPrinter(String model)
	{
		super(model);
		// TODO Auto-generated constructor stub
	}
	private int remainingCartridge = 100;
	public int getRemainingCartridge()
	{
		return remainingCartridge;
	}
	public void setRemainingCartridge(int remainingCartridge)
	{
		this.remainingCartridge = remainingCartridge;
	}
	public void refillCartridge()
	{
		remainingCartridge = 100;
	}
	public void print()
	{
		if(remainingCartridge == 0)
		{
			System.out.println("The cartridge is empty");
		}
		else 
		{
			remainingCartridge -= 10;
			System.out.println(this.toString() + " is printing. Remaining cartridge: " + remainingCartridge + "%");
		}
	}
	
}
