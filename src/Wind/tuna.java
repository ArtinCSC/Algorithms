package Wind;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class tuna extends JFrame {

	private JTextField i1, i2, i3;
	private JTextField passF;

	public tuna() {
		super("The tuna");
		setLayout(new FlowLayout());

		i1 = new JTextField(10);
		add(i1);

		i2 = new JTextField("Enter text here");
		add(i2);

		i3 = new JTextField("uneditbale", 20);
		add(i3);

		passF = new JPasswordField("mypass");
		add(passF);

		tHD handler = new tHD();
		i1.addActionListener(handler);
		i2.addActionListener(handler);
		i3.addActionListener(handler);
		passF.addActionListener(handler);

	}

	private class tHD implements ActionListener {

		public void actionPerformed(ActionEvent event) {
			String string = "";

			if (event.getSource() == i1)
				string = String.format("field 1 : %s", event.getActionCommand());

			else if (event.getSource() == i2)
				string = String.format("field 2 : %s", event.getActionCommand());

			else if (event.getSource() == i3)
				string = String.format("field 3 : %s", event.getActionCommand());

			else if (event.getSource() == passF)
				string = String.format("Password field is : %s", event.getActionCommand());

			JOptionPane.showMessageDialog(null, string);

		}

	}
}
