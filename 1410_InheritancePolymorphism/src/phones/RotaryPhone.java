package phones;

public class RotaryPhone extends DeskPhone
{
	public RotaryPhone(String model, Dimension dimension, Voltage voltage)
	{
		super(model, dimension, voltage);
	}

	@Override
	public String call(long number)
	{
		// TODO Auto-generated method stub
		return "Rotating the dial to call " + number;
	}
}
