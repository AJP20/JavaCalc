import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class yq extends JFrame{
	
	public JButton homeButton;
	public JButton backButton;
	public JButton answerButton;
	public JLabel xLabel;
	public JLabel rLabel;
	public JTextField x;
	public JTextField r;
	public JTextField answer;
	
	public yq() {
		
		this.setTitle("Y Solver");
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
		this.homeButton.setText("        Home        ");
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
		
		
		this.x = new JTextField();
		this.x.setText("		              ");
		
		this.r = new JTextField();
		this.r.setText("		              ");
		
		
		this.answer = new JTextField();
		this.answer.setText("		  ");
		this.answer.setEditable(false);
		
		this.xLabel = new JLabel();
		this.xLabel.setText("X:");
		
		this.rLabel = new JLabel();
		this.rLabel.setText("R:");
		
		add(homeButton);
		add(backButton);
		add(xLabel);
		add(x);
		add(rLabel);
		add(r);
		add(answerButton);
		add(answer);
	}
	
	
	private void Calc_Load(){
		x.setText("");
		r.setText("");
		
			
		
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
			trig newform = new trig();
			newform.setVisible(true);
			this.setVisible(false);
			
		}
		catch(Exception ex){
			JOptionPane.showMessageDialog(null, "Error_101");
		}
	}
	
	private void answerButton_ActionPerformed(){
		try{
			double num1,num2;
			num1 = Double.parseDouble(x.getText());
			num2 = Double.parseDouble(r.getText());
			
			double Answer = (Math.pow(num1, 2));
			double Answer2 = (Math.pow(num2, 2));
			double Answer3 = (Answer2 - Answer);
			double Answer4 = (Math.sqrt(Answer3));
			
			answer.setText(String.valueOf(Answer4));
			
		}
		catch(Exception ex){
			JOptionPane.showMessageDialog(null, "Invalid Numbers");
		}
	
	}
}