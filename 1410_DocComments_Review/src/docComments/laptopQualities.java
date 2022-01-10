package docComments;
/**
 * This document contains the constructors later used by laptopList.java
 * @author manya
 *
 */
public class laptopQualities 
{
	private String brand;
	private int year;
	private String make;
	private int laptopId;
	private static int laptopCount = 12345678;
	/**
	 * @param brand
	 * @param year
	 * @param make
	 */
	public laptopQualities(String brand, int year, String make)
	{
		this.brand = brand;
		this.year = year;
		this.make = make;
		
		laptopId = laptopCount++;
	}
	/**
	 * @return the brand of the laptop which the user can later add on to.
	 */
	public String getBrand() {
		return brand;
	}
	/**
	 * @param brand the brand to set 
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}
	/**
	 * @return the make of the laptop which the user can add on to 
	 */
	public String getMake() {
		return make;
	}
	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}
	/**
	 * @return the laptopId of the laptop which is later added by the code
	 */
	public int getLaptopId() {
		return laptopId;
	}
	/**
	 * @param laptopId the laptopId to set
	 */
	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}
	
	public String printLaptop()
	{
		// TODO Auto-generated method stub
//		System.out.printf(brand + " " + make  + " " + year  + " id: " +laptopId + "\n");
		//System.out.printf(brand + " " + make  + " " + year  + " id: " +laptopId + "\n");
		return brand + " " + make  + " " + year  + " id: " +laptopId + "\n";
		
	}
	
	@Override
	public String toString() {
		return "laptopQualities [brand=" + brand + ", year=" + year + ", make=" + make + ", laptopId=" + laptopId + "]";
	}
	
	
	
	
}
