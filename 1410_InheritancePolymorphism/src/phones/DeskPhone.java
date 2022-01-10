package phones;

public abstract class DeskPhone extends Phone
{
	private boolean connected;
	private Voltage voltage;
	
	public DeskPhone(String model, Dimension dimension, Voltage voltage)
	{
		super(model, dimension);
		this.voltage = voltage;
	}

	public void plugIn()
	{
		connected = true;
	}
	
	public void unplug()
	{
		connected = false;
	}
	
	public boolean isConnected()
	{
		return connected;
	}
	
	@Override
	public String toString()
	{
		return super.toString() + " " + voltage + (isConnected() ? " connected" : " not connected");
	}
	
	
	
}
