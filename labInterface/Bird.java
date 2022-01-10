package labInterface;
/**
 * 
 * @author manya
 * implements the interface flyable
 */
public class Bird implements Flyable
{
	private final String type;

	public Bird(String t)
	{
		type = t;
	}

	@Override
	public String toString()
	{
		return type;
	}

	@Override
	public void launch()
	{
		// TODO Auto-generated method stub
		System.out.print("FLapping the wings to take off" + "\n");
	}

	@Override
	public void land()
	{
		// TODO Auto-generated method stub
		System.out.print("Flapping the wings until landing"  + "\n");
		
	}
}
