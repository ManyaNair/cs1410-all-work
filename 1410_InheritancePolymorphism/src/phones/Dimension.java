package phones;


public class Dimension
{
	private double height;
	private double width;
	private double depth;
	
	//public class	
	public Dimension(double height, double width, double depth)
	{
		// TODO Auto-generated constructor stub
		if(height <= 0 || width <= 0 || depth <= 0)
			throw new IllegalArgumentException("The height, width, and depth of a dimension needs to be positive.");
		
		this.height = height;
		this.width = width;
		this.depth = depth;
	}

	//getters
	public double getHeight()
	{
		return height;
	}
	public double getWidth()
	{
		return width;
	}
	public double getDepth()
	{
		return depth;
	}

	
	//ToString
	@Override
	public String toString()
	{
		/*
		 * 143.234 orignal
		 * 1432.34
		 * 1432
		 * 143.2
		 */
		double depthOnePlace = Math.round(depth*(double)10)/(double)10;
		double heightOnePlace = Math.round(height*(double)10)/(double)10;
		double widthOnePlace = Math.round(width*(double)10)/(double)10;
		return "(" + heightOnePlace + " x " + widthOnePlace + " x " + depthOnePlace + ")";
	}
}
