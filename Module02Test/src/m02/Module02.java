package m02;

import java.util.ArrayList;

/**
 * 
 * @author manya
 * Class tests Parent PowerPlant and all child classes
 */
public class Module02
{

	public static void main(String[] args)
	{
		ArrayList<PowerPlant> powerPlants = new ArrayList<>();
		powerPlants.add(new PowerPlant(100));
		powerPlants.add(new WindFarm(6800, false));
		powerPlants.add(new WindFarm(400, true));
		powerPlants.add(new HydroPowerPlant(22500, true));
		powerPlants.add(new HydroPowerPlant(15, false));
		
		for (PowerPlant p : powerPlants)
		{
			System.out.println(p);
			System.out.println(p.generateElectricty() + "\n");
		}
	}

}
