package m03;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Module03Gui extends JFrame
{

	private JPanel contentPane;
	private JLabel treeImages = new JLabel();
	private int index = 2;
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
					Module03Gui frame = new Module03Gui();
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
	public Module03Gui()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel topLabel = new JLabel("Four Seasons");
		topLabel.setBorder(new EmptyBorder(10, 0, 8, 0));
		topLabel.setOpaque(true);
		topLabel.setFont(new Font("Georgia", Font.PLAIN, 18));
		topLabel.setForeground(new Color (211, 211, 211));
		topLabel.setHorizontalAlignment(SwingConstants.CENTER);
		topLabel.setBackground(new Color(155, 155, 155));
		contentPane.add(topLabel, BorderLayout.NORTH);
		treeImages.setHorizontalAlignment(SwingConstants.CENTER);
		
		contentPane.add(treeImages, BorderLayout.CENTER);
		treeImages.setIcon(new ImageIcon(Module03Gui.class.getResource("/Images/treeImage1.png")));
		
		JButton changeSeason = new JButton("As Time Moves On...");
		changeSeason.setBorder(new EmptyBorder(4, 0, 4, 0));
		changeSeason.setBackground(new Color(155, 155, 155));
		changeSeason.setForeground(new Color (230, 230, 230));
		changeSeason.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				if(index < 4)
				{
					treeImages.setIcon(new ImageIcon(Module03Gui.class.getResource("/Images/treeImage" + index + ".png")));
					if(index == 1)
					{
						topLabel.setText("Fall");
					}
					if(index == 2)
					{
						topLabel.setText("Winter");
					}
					if(index == 3)
					{
						topLabel.setText("Spring");
					}
					index++;
				}
				else
				{
					treeImages.setIcon(new ImageIcon(Module03Gui.class.getResource("/Images/treeImage4.png")));
					topLabel.setText("Summer");
					index = 1;
				}
			}
		});
		contentPane.add(changeSeason, BorderLayout.SOUTH);
	}

}
