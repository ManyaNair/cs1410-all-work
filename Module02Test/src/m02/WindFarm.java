package m02;
/**
 * 
 * @author manya
 * Child class of PowerPlant is type Windfarm
 * Takes parameters of capacity and offshore
 *
 */
public class WindFarm extends PowerPlant
{
	private boolean offshore;
	//offshore return true if offshore, false if not
	public WindFarm(int capacity, boolean offshore)
	{
		super(capacity);
		this.offshore = offshore;
	}

	public boolean isOffshore()
	{
		return offshore;
	}
	
	//Overrides generateElectricity in PowerPlant
	public String generateElectricty()
	{
		return "generating electricity from wind";
	}

	//toString
	@Override
	public String toString()
	{
		//if it is offshore return waves if not blank
		return super.toString() + (isOffshore() ? " ~~~" : "");
	} 
	

}
