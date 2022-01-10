package docComments;
/**
 * The make, model, and mileage of a car
 * @author manya
 *
 */
public class Car 
{
	private String make;
	private String model;
	private int mpg;
	
	/**
	 * Constructor initializes the fields
	 * 
	 * @param make
	 * @param model
	 * @param mpg
	 */
	public Car(String make, String model, int mpg) {
		this.make = make;
		this.model = model;
		this.mpg = mpg;
	}
	/**
	 * 
	 * Returns the make, model, and mpg of the car
	 * 
	 * @return the make 
	 */
	public String getMake() {
		return make;
	}
	/**
	 * Returns the model of the car
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	/**
	 * Returns the miles per gallon of the car
	 * @return the mpg
	 */
	public int getMpg() {
		return mpg;
	}

	
	
	
}
