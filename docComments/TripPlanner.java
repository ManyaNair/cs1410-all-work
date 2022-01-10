package docComments;
/**
 * 
 * @author manya
 *
 */
public class TripPlanner 
{
		private String departure;
		private String arrival;
		private int distance;
		private Car car;
		/**
		 * @param departure user departure location
		 * @param arrival user arrival location
		 * @param distance distance between departure and arrival locations
		 * @param car car used to make the trip
		 */
		public TripPlanner(String departure, String arrival, int distance, Car car) {
			this.departure = departure;
			this.arrival = arrival;
			this.distance = distance;
			this.car = car;
		}
		
		public double fuelConsumption()
		{
			return (double)distance/(double)car.getMpg();
		}
		@Override
		public String toString() {
			return "TripPlanner [departure=" + departure + ", arrival=" + arrival + ", distance=" + distance + ", car="
					+ car.getModel() + "]";
		}
		
		
		
		
		
}
