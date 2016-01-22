import java.awt.*;

import java.awt.event.*;

import javax.swing.*;
public class dr extends JFrame{
	
	public JButton homeButton;
	public JButton backButton;
	public JButton answerButton;
	public JTextField num;
	public JTextField answer;
	
	public dr() {
		
		this.setTitle("Degrees to Radians");
		this.setSize(new Dimension(250,350));
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		this.setLayout(new FlowLayout());
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.addComponentListener(new ComponentListener(){

			public void componentHidden(ComponentEvent arg0) {}

			public void componentMoved(ComponentEvent arg0) {}

			public void componentResized(ComponentEvent arg0) {}

			public void componentShown(ComponentEvent arg0) {
				Calc_Load();
			}
		});
		
		
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
		this.answerButton = new JButton();
		this.answerButton.setText("Answer");
		this.answerButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				answerButton_ActionPerformed();
			}
		});
		
		
		this.num = new JTextField();
		this.num.setText("		");
		
		
		this.answer = new JTextField();
		this.answer.setText("		  ");
		this.answer.setEditable(false);
		
		add(homeButton);
		add(backButton);
		add(num);
		add(answerButton);
		add(answer);
	}
	
	
	private void Calc_Load(){
		num.setText("");
		
			
		
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
	
	private void answerButton_ActionPerformed(){
		try{
			double num1;
			num1 = Double.parseDouble(num.getText());
			
			double Answer2 = (num1 * 0.0174532925);
			
			answer.setText(String.valueOf(Answer2));
			
		}
		catch(Exception ex){
			JOptionPane.showMessageDialog(null, "Invalid Numbers");
		}
	
	}
}