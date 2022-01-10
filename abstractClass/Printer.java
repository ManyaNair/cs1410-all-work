package abstractClass;

public abstract class Printer
{
	private String model;
	private static int count;
	private int serialNumber = 12345;

	public Printer(String model)
	{
		//super();
		this.model = model;
		count++;
		serialNumber += count;
		
	}
	public abstract void print();
	public String getModel()
	{
		return model;

	}

	public int getSerialNumber()
	{
		return serialNumber;

	}

	@Override
	public String toString()
	{
		return String.format(this.getClass().getSimpleName() + ": " + model + " #" + serialNumber);
	}
}
