package abstractClass;

public class LaserPrinter extends Printer
{
	public LaserPrinter(String model)
	{
		super(model);
		// TODO Auto-generated constructor stub
	}

	private int remainingToner = 100;

	public int getRemainingToner()
	{
		return remainingToner;
	}

	public void setRemainingToner(int remainingToner)
	{
		this.remainingToner = remainingToner;
	}
	public void refillToner()
	{
		remainingToner = 100;
	}
	public void print()
	{
		if(remainingToner == 0)
		{
			System.out.println("The toner is empty");
		}
		else
		{
			remainingToner -= 10;
			System.out.println(this.toString() + " is printing. Remaining toner: " + remainingToner + "%");
		}
	}
	
}
