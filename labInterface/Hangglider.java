package labInterface;
/**
 * 
 * @author manya
 * implements interface flyable
 */
public class Hangglider implements Flyable
{
	private final boolean isRigidWing;

	public Hangglider(boolean rigidWing)
	{
		isRigidWing = rigidWing;
	}

	@Override
	public String toString()
	{
		return String.format(isRigidWing ? "Rigid-wing" : "Flex-wing");
	}

	@Override
	public void launch()
	{
		// TODO Auto-generated method stub
		System.out.print("Running until take-off" + "\n");
	}

	@Override
	public void land()
	{
		// TODO Auto-generated method stub
		System.out.print("Gliding to a land"  + "\n");
	}
}
