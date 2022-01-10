package phones;

public abstract class Phone
{
	private String model;
	private Dimension dimension;

	public Phone(String model, Dimension dimension)
	{
		this.model = model;
		this.dimension = dimension;
	}
	
	//Getters
//	public String getModel()
//	{
//		return model;
//	}
//	public Dimension getDimension()
//	{
//		return dimension;
//	}

	public abstract String call(long number);

	@Override
	public String toString()
	{
		return model + " " + dimension.toString();
	}
	
	
}
