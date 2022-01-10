package guiLayout;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class LabGuiLayout extends JFrame
{

	private JPanel contentPane;
	private JTextField txtDemoLayout;
	private JPanel colorBoxes;
	private JPanel userChoice;
	private Spot[] boxSpots = new Spot[4];

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
					LabGuiLayout frame = new LabGuiLayout();
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
	public LabGuiLayout()
	{
		for (int i = 0; i < boxSpots.length; i++)
		{
			int num = i + 1;
			if (i == 1)
				boxSpots[i] = new Spot(Color.blue, "" + num);
			else
				boxSpots[i] = new Spot(Color.yellow, "" + num);
		}

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		DemoLayoutTxt();

		JPanel userChoice = userChoice();
		leftButton(userChoice);
		rightButton(userChoice);

		JPanel colorBoxes = colorBoxes();
		setUpBoxes(colorBoxes);

	}

	private final void DemoLayoutTxt()
	{
		txtDemoLayout = new JTextField();
		txtDemoLayout.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtDemoLayout.setEditable(false);
		txtDemoLayout.setBackground(Color.LIGHT_GRAY);
		txtDemoLayout.setText("Demo Layout");
		txtDemoLayout.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(txtDemoLayout, BorderLayout.NORTH);
		txtDemoLayout.setColumns(10);
	}

	private JPanel colorBoxes()
	{
		colorBoxes = new JPanel();
		colorBoxes.setBorder(new EmptyBorder(8, 8, 8, 8));
		contentPane.add(colorBoxes, BorderLayout.CENTER);
		return colorBoxes;
	}

	private JPanel userChoice()
	{
		userChoice = new JPanel();
		userChoice.setBorder(new EmptyBorder(8, 8, 8, 8));
		contentPane.add(userChoice, BorderLayout.WEST);
		userChoice.setBackground(Color.LIGHT_GRAY);
		return userChoice;
	}

	private void setUpBoxes(JPanel colorBoxes)
	{
		colorBoxes.setLayout(new GridLayout(1, 4, 10, 10));

		for (int i = 0; i < boxSpots.length; i++)
		{
			colorBoxes.add(boxSpots[i]);
		}

	}

	private void rightButton(JPanel userChoice)
	{
		JButton rightButton = new JButton("--->");
		rightButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				updateIndex(false);

				boxSpots[Spot.getCurrentIndex()].setBackground(Color.BLUE);

				if (Spot.getCurrentIndex() - 1 >= 0)
				{
					boxSpots[Spot.getCurrentIndex() - 1].setBackground(Color.yellow);
				} else
				{
					boxSpots[boxSpots.length - 1].setBackground(Color.YELLOW);
				}

			}
		});
		userChoice.add(rightButton);
	}

	private void updateIndex(boolean left)
	{
		if (left)
		{
			Spot.setCurrentIndex(Spot.getCurrentIndex() - 1);
			if (Spot.getCurrentIndex() < 0)
				Spot.setCurrentIndex(3);
		} else
		{
			Spot.setCurrentIndex(Spot.getCurrentIndex() + 1);
			if (Spot.getCurrentIndex() > 3)
				Spot.setCurrentIndex(0);
		}
	}

	private void leftButton(JPanel userChoice)
	{
		JButton leftButton = new JButton("<---");
		leftButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				updateIndex(true);
				boxSpots[Spot.getCurrentIndex()].setBackground(Color.BLUE);
				
				if (Spot.getCurrentIndex() + 1 <= 3)
				{
					boxSpots[Spot.getCurrentIndex() + 1].setBackground(Color.yellow);
				} else
				{
					boxSpots[0].setBackground(Color.YELLOW);
				}
			}
		});
		userChoice.setLayout(new GridLayout(4, 1, 10, 10));
		userChoice.add(leftButton);
	}

}