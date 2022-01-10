package guiLayout;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class Spot extends JLabel
{
	private static int currentIndex = 1;

	public Spot(Color currentColor, String text)
	{
		super();
		this.setBackground(currentColor);
		this.setOpaque(true);
		this.setHorizontalAlignment(SwingConstants.CENTER);
		this.setText(text);
	}

	public static int getCurrentIndex()
	{
		return currentIndex;
	}

	public static void setCurrentIndex(int currentIndex)
	{
		Spot.currentIndex = currentIndex;
	}

}
