package m02;
/**
 * 
 * @author manya
 * Parent class 
 * Takes parameter capacity 
 */
public class PowerPlant
{
	private int capacity;
	
	//constructor
	public PowerPlant(int capacity)
	{
		if(capacity <= 0)
			throw new IllegalArgumentException("The capacity needs to be a positive number");
		this.capacity = capacity;
	}

	//getters
	public int getCapacity()
	{
		return capacity;
	}
	
	/**
	 * //generateElectricity public class
	 * @return "generating electricity"
	 * is overridden in child classes
	 */
	
	public String generateElectricty()
	{
		return "generating electricity";
	}
	
	//shows type of powerplant

	@Override
	public String toString()
	{
		return String.format(this.getClass().getSimpleName() + " " + capacity + "MW");
	}
	
	

}
