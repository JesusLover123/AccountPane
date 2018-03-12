import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class BankPanel extends JPanel
{
	private ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
	
	public BankPanel()
	{
		setBounds(0, 0, 600, 600);
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		
		JLabel name = new JLabel("Name: ");
		add(name, gbc);
		JLabel ideposit = new JLabel("Initial Deposit:");
		gbc.gridy++;
		add(ideposit, gbc);
		JLabel acttype = new JLabel("Account Type:");
		gbc.gridy++;
		add(acttype, gbc);
		JTextField namein = new JTextField();
		gbc.gridy = 0;
		gbc.gridx++;
		namein.setPreferredSize(new Dimension(100, 20));
		add(namein, gbc);
		JTextField idepin = new JTextField();
		gbc.gridy++;
		idepin.setPreferredSize(new Dimension(100, 20));
		add(idepin, gbc);
		String[] words = {"Checking", "Savings"};
		JList typein = new JList(words);
		JScrollPane scrOptions = new JScrollPane(typein);
		gbc.gridy++;
		scrOptions.setPreferredSize(new Dimension(70, 50));
		add(scrOptions, gbc);
		JButton submit = new JButton("Submit");
		gbc.gridy++;
		submit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				if(typein.getSelectedValue().equals("Checking"))
				{
					accounts.add(new CheckingAccount(namein.getText(), Double.parseDouble(idepin.getText()), 0, 0, 0));
				}
				if(typein.getSelectedValue().equals("Savings"))
				{
					accounts.add(new SavingsAccount(namein.getText(), Double.parseDouble(idepin.getText()), 0, 0, 0));
				}
				else
				{
					
				}
			}
			
		});
		add(submit, gbc);
		
		setVisible(true);
	}
}
