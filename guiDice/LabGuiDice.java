 package guiDice;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.*;

public class LabGuiDice extends JFrame
{
	private JPanel contentPane;
	private JLabel diceJLabel = new JLabel();
	Random rand = new Random();
	int index = rand.nextInt(6)+1;

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
					LabGuiDice frame = new LabGuiDice();
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
	public LabGuiDice()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		diceJLabel.setBounds(84, 11, 234, 224);
		diceJLabel.setBorder(new EmptyBorder(30, 30, 30, 30));
		
		diceJLabel.setIcon(new ImageIcon(LabGuiDice.class.getResource("/DieImages/die-" + index+".png")));
		
		JButton btnNewButton = newButtonRollEm();
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int x = random();
				
				
				while(x == index) {

					x = random();
				}

				diceJLabel.setIcon(new ImageIcon(LabGuiDice.class.getResource("/DieImages/die-" + x+".png")));
				index = x;
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton);
		contentPane.add(diceJLabel);
		 
	}
	private int random() {
		return rand.nextInt(6)+1;

	}

	private JButton newButtonRollEm()
	{
		JButton btnNewButton = new JButton("Roll 'Em");
		btnNewButton.setBounds(5, 229, 428, 31);
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setForeground(new Color(240, 128, 128));
		btnNewButton.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 18));
		return btnNewButton;
	}

}
