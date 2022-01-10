package phones;

import java.util.Random;

public class SmartPhone extends Phone
{
	private int storage;
	
	public SmartPhone(String model, Dimension dimension, int storage)
	{
		super(model, dimension);
		
		if(storage <= 0)
			throw new IllegalArgumentException("Storage needs to be assigned a positive value.");
		
		this.storage = storage;
	}
	
//	public int getStorage()
//	{
//		return storage;
//	}
	public String call(long number)
	{
		return "Calling " + number + " by selecting the number";
	}
	
	public String browse()
	{
		return "Browsing the web";
	}
	
	public String takePicture()
	{
		String [] choices = {"Taking a horizontal picture", "Taking a vertical picture"};
		int rnd = new Random().nextInt(choices.length);
		return choices[rnd];
	}

	@Override
	public String toString()
	{
		return super.toString() + " " + storage + "GB";

	}
	
	
	
}
