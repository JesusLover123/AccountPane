import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;

public class BankFrame extends JFrame
{
	static BankPanel myPanel;
	public BankFrame()
	{
		setBounds(300, 300, 800, 800);
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		myPanel = new BankPanel();
		add(myPanel);
		pack();
		setVisible(true); 
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args)
	{
		new BankFrame();
		
	}
}
