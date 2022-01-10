package docComments;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * This java document gets a users input and completes requests based on what choice the users make
 * @author manya
 *
 */
public class laptopList 
{	
	/**
	 * 
	 * @param args
	 * 
	 */
	public static void main(String[] args) 
	{

		ArrayList<laptopQualities> laptops = new ArrayList<laptopQualities>();
		
		laptops.add(new laptopQualities("Apple", 2015, "Macbook"));
		laptops.add(new laptopQualities("Microsoft", 2019, "Surface Pro"));
		laptops.add(new laptopQualities("Google", 2021, "Chromebook"));
		laptops.add(new laptopQualities("Lenovo", 2018, "Idea Pad"));

		Scanner q = new Scanner(System.in);

		while (true) {
			System.out.println("Enter a number from 1 - 6" + "\n" + "1. Show all laptops" + "\n" + "2. Add a laptops"
					+ "\n" + "3. Find a laptops" + "\n" + "4. Delete a laptops" + "\n" + "5. Number of laptops" + "\n"
					+ "6. Exit");

			int userNum = q.nextInt();
			q.nextLine();

			if (userNum == 6) {
				break;
			} else if (userNum == 1) {
				printAllLaptops(laptops);
			}else if (userNum == 2) {
				enterNewLaptop(laptops, q);
			}else if (userNum == 3) {
				findLaptopByID(laptops, q);
			}else if (userNum == 4) {
				removeLaptopById(laptops, q);
			}else if (userNum == 5) {
				System.out.println("The number of laptops is " + laptops.size() + "\n");
			}else {
				System.out.println("You did not choose a number between 1 and 6 please try again");
			}

		}

	}

	/**
	 * The method removes the laptop by the Id input by the user.
	 *The for-loop loops through the array list to find the laptop which has the matching id and then removes it
	 * @param laptops holds the list of laptops contained in the array list
	 * @param q q is the variable the stores the user's input
	 */
	protected static void removeLaptopById(ArrayList<laptopQualities> laptops, Scanner q) {
		System.out.println("What is the Laptop's Id number? ");
		int inputId = q.nextInt();
		for (int i = 0; i < laptops.size(); i++) 
		{
			
			if (laptops.get(i).getLaptopId() == inputId) 
			{
				System.out.println(laptops.get(i).printLaptop() + " has been removed" + "\n");
				laptops.remove(i);
			}
			else if(laptops.get(i).getLaptopId() != inputId && i == laptops.size()-1)
			{
				System.out.println("There are no laptop under this Id, please give the Id of the laptop you would like to remove" + "\n");
			}
		}
			

		
	}

	/**
	 * This method finds the laptop by the id input by the user and returns the matching laptop with its make, model, and year
	 * @param laptops 
	 * @param q
	 */
	protected static void findLaptopByID(ArrayList<laptopQualities> laptops, Scanner q) {
		System.out.println("What is the Laptop's Id number? ");
		int inputId = q.nextInt();

		for (int i = 0; i < laptops.size(); i++) 
		{
			if (laptops.get(i).getLaptopId() == inputId) 
			{
				System.out.println("The laptop you are looking for is: " + laptops.get(i).getBrand() + " " + laptops.get(i).getMake() + " id: "
						+ laptops.get(i).getLaptopId() + "\n");
				//break;

			}
			else if(laptops.get(i).getLaptopId() != inputId && i == laptops.size()-1)
			{
				System.out.println("There are no laptop under this Id, please give the Id of the laptop you would like to find" + "\n");
			}
		}
	}

	/**
	 * This method allows the user to create a new laptop to add into the arraylist. 
	 * @param laptops holds the list of laptops contained in the array list
	 * @param q q is the variable the stores the user's input
	 * the user must enter the brand, make, and year and then the id will automatically be created
	 */
	protected static void enterNewLaptop(ArrayList<laptopQualities> laptops, Scanner q) 
	{
		
		System.out.println("Enter the Brand: ");
		String brand = q.nextLine();

		q.nextLine();
		System.out.println("Enter the year: ");
		int year = q.nextInt();

		q.nextLine();
		System.out.println("Enter the Make: ");
		String make = q.nextLine();
		System.out.println();

		laptops.add(new laptopQualities(brand, year, make));
		System.out.println("The laptop you added is: " + laptops.get(laptops.size()-1).getBrand() + " " + laptops.get(laptops.size()-1).getMake() + " id: "
				+ laptops.get(laptops.size()-1).getLaptopId() + "\n");
	}

	/**
	 * This method prints out all the laptops that are existant inside the arraylist.
	 * @param laptops holds the list of laptops contained in the array list
	 */
	protected static void printAllLaptops(ArrayList<laptopQualities> laptops)
	{
		for (int j = 0; j < laptops.size(); j++) 
		{
			System.out.println(laptops.get(j).printLaptop());
		}
	}
}
