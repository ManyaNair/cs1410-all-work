package docComments;
/**
 * 
 * @author manya
 *
 */
public class TravelApp
{
	/**
	 * The main method prints out the requested information
	 * First the Cars with their makes and models will print out
	 * Then the two trips will print out stating the departure, arrival, distance, and type of car
	 * under which the fuel consumption will also be printed.
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Car car1 = new Car("BMW", "m4", 25);
		System.out.println("Cars: " + "\n" + car1.getMake() + " " + car1.getModel() + " " + car1.getMpg());
		Car car2 = new Car("Honda", "Civic", 42);
		System.out.println(car2.getMake() + " " + car2.getModel() + " " + car2.getMpg());
		
		
		System.out.println();
		TripPlanner trip1 = new TripPlanner("SF", "LA", 382, car1);
		TripPlanner trip2 = new TripPlanner("Tampa", "Miami", 280, car2);
		
		
		System.out.println("California Trip: ");
		System.out.println(trip1);
		System.out.println("fuel consumption: " + String.format("%.1f",trip1.fuelConsumption()));
		System.out.println();
		System.out.println("Florida Trip: ");
		System.out.println(trip2);
		System.out.println("fuel consumption: " + String.format("%.1f",trip2.fuelConsumption()));
	
	}
}
