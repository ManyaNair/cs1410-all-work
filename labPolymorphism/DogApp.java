package labPolymorphism;
/**
 * 
 * @author manya
 *
 */
public class DogApp
{
	/**
	 * Main method creates and prints the new dogs through the static way and then by using the array for the dynamic way
	 * @param args
	 */
	public static void main(String[] args)
	{
		Dog myDog = new Dog("Greyhound");
		System.out.println(myDog);
		actAsDog(myDog);

		SledDog mySledDog = new SledDog("Husky");
		System.out.println(mySledDog);
		actAsDog(mySledDog);

		CircusDog myCircusDog = new CircusDog("Terrier");
		System.out.println(myCircusDog);
		actAsDog(myCircusDog);

		System.out.println("Using an Array" + "\n");
		
		//Creates all instances of dog in the array
		  Dog[] dogObjects = new Dog[3]; 
		  dogObjects[0] = new Dog("Greyhound");
		  dogObjects[1] = new SledDog("Husky");
		  dogObjects[2] = new CircusDog("Terrier");
		  
		  //Foreach loop to print each dog
			  for(Dog d : dogObjects) 
			  { 
				  if (d instanceof SledDog) 
				  { 
					  System.out.println(d);
					  ((SledDog)d).pullSled(); actAsDog(d); 
				  } 
				  else 
				  {
					  System.out.println(d); actAsDog(d); 
				  } 
				  
			  }
				 

	}
	/**
	 * 
	 * @param d
	 * calls class dog to communicate and move
	 */
	private static void actAsDog(Dog d)
	{
		d.communicate();
		d.move();
		System.out.println();
	}
}
