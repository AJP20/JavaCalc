import java.awt.*;

import java.awt.event.*;

import javax.swing.*;
public class pi extends JFrame{
	
	public JButton homeButton;
	public JButton backButton;
	public JButton piButton;
	public JTextField answer;
	
	public pi() {
		this.setTitle("PI");
		this.setSize(new Dimension(250,350));
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		this.setLayout(new FlowLayout());
		this.setResizable(false);
		
		
		this.homeButton = new JButton();
		this.homeButton.setText("Home");
		this.homeButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				homeButton_ActionPerformed();
			}
		});
		
		this.backButton = new JButton();
		this.backButton.setText("         Back         ");
		this.backButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				backButton_ActionPerformed();
			}
		});
		
		
		this.piButton = new JButton();
		this.piButton.setText("PI");
		this.piButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				piButton_ActionPerformed();
			}
		});
		
		
		this.answer = new JTextField();
		this.answer.setText("		  ");
		this.answer.setEditable(false);
		
		add(homeButton);
		add(backButton);
		add(piButton);
		add(answer);
	}
	
	
	
	

	private void homeButton_ActionPerformed(){
		try{
			Calculator newform = new Calculator();
			newform.setVisible(true);
			this.setVisible(false);
			
		}
		catch(Exception ex){
			JOptionPane.showMessageDialog(null, "Error_101");
		}
	}
	
	private void backButton_ActionPerformed(){
		try{
			menu newform = new menu();
			newform.setVisible(true);
			this.setVisible(false);
			
		}
		catch(Exception ex){
			JOptionPane.showMessageDialog(null, "Error_101");
		}
	}
	
	private void piButton_ActionPerformed(){
		try{
			
			answer.setText(String.valueOf(Math.PI));
			
		}
		catch(Exception ex){
			JOptionPane.showMessageDialog(null, "Invalid Numbers");
		}
	
	}
}