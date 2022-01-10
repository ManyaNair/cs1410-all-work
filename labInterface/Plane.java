package labInterface;
/**
 * 
 * @author manya
 * implements the interface flyable
 *
 */
public class Plane implements Flyable
{
	private final int numberOfEngines;
	private final String model;

	public Plane(int engines, String m)
	{
		numberOfEngines = engines;
		model = m;
	}

	@Override
	public String toString()
	{
		return String.format("%s with %d engines", model, numberOfEngines);
	}

	@Override
	public void launch()
	{
		// TODO Auto-generated method stub
		System.out.print("Rolling until take-off");
	}
	
	@Override
	public void land()
	{
		// TODO Auto-generated method stub
		System.out.print("Rolling to a stop");
	}
}
