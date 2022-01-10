package panels;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JPanel;


import javax.swing.JLabel;
import java.awt.BorderLayout;

@SuppressWarnings("serial")
public class picturePanel extends JPanel
{
	private JLabel flowerLabel = new JLabel("");
	private JLabel potLabel = new JLabel("");
	private JLabel stemLabel = new JLabel("");
	private JLabel stemNewLabel = new JLabel("");
	
	private int colorIndex;
	private Color[] colors = {Color.GRAY, Color.green, Color.red};
	
	private int[][] flowerBounds = {{228, 21}, {228, 21}, {228, 21}};
	private int[][] stemBounds = {{269, 83}, {254, 83}, {246, 83}};
	private int[][] potBounds = {{240, 132}, {255, 132}, {257, 132}};
	
	private ImageIcon[] flowers = {
			new ImageIcon(picturePanel.class.getResource("/flowerImages/hibiscus1.png")),
			new ImageIcon(picturePanel.class.getResource("/flowerImages/lotus3.png")),
			new ImageIcon(picturePanel.class.getResource("/flowerImages/normalFlower.png"))
	};
	int flowerIndex = 0;
	private ImageIcon[] stems = {
			new ImageIcon(picturePanel.class.getResource("/stemImages/drawingStem1.png")),
			new ImageIcon(picturePanel.class.getResource("/stemImages/drawingStem2.png")),
			new ImageIcon(picturePanel.class.getResource("/stemImages/drawingStem3.png"))
	};
	int stemIndex = 0;

	private ImageIcon[] pots = {
			new ImageIcon(picturePanel.class.getResource("/potImages/drawingPot1.png")),
			new ImageIcon(picturePanel.class.getResource("/potImages/drawingPot3.png")),
			new ImageIcon(picturePanel.class.getResource("/potImages/drawingPot4.png"))
	};
	int potIndex = 0;
	

	/**
	 * Create the panel.
	 */
	public picturePanel()
	{
		this.setOpaque(true);
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		
		flowerLabel();
		
		potLabel.setBounds(potBounds[potIndex][0],potBounds[potIndex][1], 107, 111);
		potLabel.setIcon(pots[potIndex]);
		add(potLabel);
		
		stemLabel.setBounds(stemBounds[stemIndex][0],stemBounds[stemIndex][1], 107, 111);
		stemLabel.setIcon(stems[stemIndex]);
		add(stemLabel);
		
		stemNewLabel.setBounds(stemBounds[stemIndex][0],stemBounds[stemIndex][1], 107, 111);
		add(stemNewLabel);
		
	}

	private void flowerLabel()
	{
		flowerLabel.setBounds(flowerBounds[flowerIndex][0],flowerBounds[flowerIndex][1], 107, 111);
		flowerLabel.setIcon(flowers[flowerIndex]);
		add(flowerLabel);
	}
	
	public void updateImage(boolean updateFlower, boolean updateStem, boolean updatePot)
	{
		
		if (!updateFlower && !updateStem && !updatePot) 
		{ 
			colorIndex = ++colorIndex %
			colors.length; this.setBackground(colors[colorIndex]); 
		}
		 
		if (updateFlower)
			flowerIndex = ++flowerIndex % flowers.length;
		if (updateStem)
			stemIndex = ++stemIndex % stems.length;
		if (updatePot)
			potIndex = ++potIndex % pots.length;
		
		
		stemLabel.setIcon(stems[stemIndex]);
		flowerLabel.setIcon(flowers[flowerIndex]);
		potLabel.setIcon(pots[potIndex]);
		flowerLabel.setBounds(flowerBounds[flowerIndex][0],flowerBounds[flowerIndex][1], 107, 111);
		stemLabel.setBounds(stemBounds[stemIndex][0],stemBounds[stemIndex][1], 107, 111);
		potLabel.setBounds(potBounds[potIndex][0],potBounds[potIndex][1], 107, 111);		
	}
}
