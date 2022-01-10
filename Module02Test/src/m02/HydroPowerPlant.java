package m02;
/**
 * 
 * @author manya
 * Hydroplant is child class of Powerplant 
 * takes in capacity and dam
 */
public class HydroPowerPlant extends PowerPlant
{

	private boolean dam;
	public HydroPowerPlant(int capacity, boolean dam)
	{
		super(capacity);
		this.dam = dam;
	}
	
	public boolean hasDam()
	{
		return dam;
	}
	/**
	 * Overrides generateElectricity in PowerPlant
	 */
		public String generateElectricty()
		{
			return "generating electricity from water";
		}

		//toString
		@Override
		public String toString()
		{
			
			return super.toString() + (hasDam() ? " with a dam" : " without a dam");
		} 
		

}
