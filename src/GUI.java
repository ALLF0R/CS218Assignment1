

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener{
	
	int PlayerInput = 1;
	int client;
	
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	JButton b5;
	JLabel l1;
	JLabel l2;
	
	ImageIcon Player1;
	
	public GUI()
	{
		
		
		JFrame frame = new JFrame("SAPUI");
		frame.setSize(500, 500);
		frame.setBackground(new Color(235, 154, 26));
		
		  
		  // Setting layout as null
		frame.setLayout(null);
		  
		// Creating Button
		b1 = new JButton("Rock");
		b1.addActionListener(this);
		b1.setBackground(new Color(235, 154, 90));
		
		b2 = new JButton("Paper");
		b2.addActionListener(this);
		b2.setBackground(new Color(235, 154, 90));
		
		b3 = new JButton("Scissors");
		b3.addActionListener(this);
		b3.setBackground(new Color(235, 154, 90));
		
		b4 = new JButton("Lizard");
		b4.addActionListener(this);
		b4.setBackground(new Color(235, 154, 90));
		
		b5 = new JButton("Spock");
		b5.addActionListener(this);
		b5.setBackground(new Color(235, 154, 90));
		  
		// Setting position and size of a button
		b1.setBounds(173,377,120,40);
		b2.setBounds(173,334,120,40);
		b3.setBounds(293,377,120,40);
		b4.setBounds(293,334,120,40);
		b5.setBounds(47,377,120,40);
		
		l1 = new JLabel("PLAYER 1");
		l1.setBounds(100,20,120,40);
		l1.setFont(new Font("Ubuntu",Font.BOLD,17));
		l2 = new JLabel("PLAYER 2");
		l2.setFont(new Font("Ubuntu",Font.BOLD,17));
		l2.setBounds(300,20,120,40);
		
		//Player1 = new ImageIcon("image/rock");
		
		  
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);
		frame.add(b5);
		
		frame.add(l1);
		frame.add(l2);
		
		
		//frame.setIconImage(Player1.getImage());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setBackground(Color.BLUE);
		frame.setVisible(true);
      
	}
	
	
   public static void main(String arg[]) {
     new GUI();
   }
   
   public void GameLogic() {
	   
	  
	   
   }

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== b1)
		{
			PlayerInput = 1;
			System.out.println("Rock");
			
		}
		if(e.getSource()==b2)
		{
			PlayerInput = 2;
			System.out.println("Paper");
		}
		if(e.getSource()==b3)
		{
			PlayerInput = 3;
			System.out.println("Scissors");
		}
		if(e.getSource()==b4)
		{
			PlayerInput = 4;
			System.out.println("Lizard");
		}
		if(e.getSource()==b5)
		{
			PlayerInput = 5;
			System.out.println("Spock");
		}
	}
}
	
	
	
	
	
	
	
	
	
	
	
	