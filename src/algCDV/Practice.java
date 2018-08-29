/**
 * 
 */
/**
 * @author 
 *
 */
package algCDV;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Practice extends JFrame implements ActionListener {
	
	private JTextField text;

	public Practice(){
		
		setSize(500,600);
		addWindowListener(new WindowDestroyer());
		setTitle("myProject");
		
		
		
		Container contentPane = getContentPane();
		
		contentPane.setLayout(new FlowLayout());
		contentPane.setBackground(Color.LIGHT_GRAY);

		JPanel panel = new JPanel();
		
		panel.setLayout(new FlowLayout());
		
		  text = new JTextField("here", 25);
		  panel.add(text);
		  contentPane.add(panel, BorderLayout.SOUTH);
		  
		  JButton myBut = new JButton("It Dose Nothing");
		  myBut.addActionListener(this);
		  contentPane.add(myBut);
		  
		  

		
	}
	
	private void actionProformer()

	private void addWindoListener(WindowDestroyer windowDestroyer) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {

		Practice prac = new Practice();
		
		prac.setVisible(true);
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}