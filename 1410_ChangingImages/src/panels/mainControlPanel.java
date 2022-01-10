package panels;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.SystemColor;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;

@SuppressWarnings("serial")
public class mainControlPanel extends JFrame
{

	private JPanel contentPane;
	private JCheckBox flowerCheckBox, potCheckBox,stemCheckBox;
	private JButton submitButton;
	private picturePanel picturePanel;
	private JPanel controlPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					mainControlPanel frame = new mainControlPanel();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public mainControlPanel()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		initContentPane();

		controlPanel = controlPanel();
		
		picturePanel = new picturePanel();
		contentPane.add(picturePanel, BorderLayout.CENTER);

		setUpFlowerChkBox();

		picturePanel.add(controlPanel, BorderLayout.WEST);
		
		submitButton = new JButton("Submit");
		submitButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				submitAction();
			}

		});
		submitButton.setBackground(SystemColor.activeCaptionBorder);
		controlPanel.add(submitButton);
		/*
		 * flowerCheckBox(); stemCheckBox(); potCheckBox(); submitButton();
		 */

	}
	
	private void submitAction()
	{
		boolean flower = false;
		boolean pot = false;
		boolean stem = false;
		if (flowerCheckBox.isSelected())
		{
			flower = true;
		}
		if (potCheckBox.isSelected())
		{
			pot = true;
		}
		if (stemCheckBox.isSelected())
		{
			stem = true;
		}
		picturePanel.updateImage(flower, stem, pot);
	}

	private void setUpFlowerChkBox()
	{
		flowerCheckBox = new JCheckBox("Flower");
		flowerCheckBox.setHorizontalAlignment(SwingConstants.LEFT);
		controlPanel.add(flowerCheckBox);

		potCheckBox = new JCheckBox("Pot");
		controlPanel.add(potCheckBox);

		stemCheckBox = new JCheckBox("Stem");
		controlPanel.add(stemCheckBox);
	}

	private JPanel controlPanel()
	{
		JPanel controlPanel = new JPanel();
		controlPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		controlPanel.setBackground(Color.LIGHT_GRAY);
		controlPanel.setLayout(new GridLayout(0, 1, 5, 5));
		return controlPanel;
	}

	private void initContentPane()
	{
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
