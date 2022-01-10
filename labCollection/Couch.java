package labCollection;

import java.awt.Color;

public class Couch
{
	private Color color;
	private Material material;
	
	public Couch(Color color, Material material)
	{
		//this.color = color;
		//this.material = material;
	}

	public Color getColor()
	{
		return color;
	}
	public Material getMaterial()
	{
		return material;
	}

	
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Couch other = (Couch) obj;
		if (color == null)
		{
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (material != other.material)
			return false;
		return true;
	}
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((material == null) ? 0 : material.hashCode());
		return result;
	}

	@Override
	public String toString()
	{
		//return "Couch: " + "color + %02x" + " " + material;
		return "Couch: " + color + " " + material;
		
	}

	

}
