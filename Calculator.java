import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class Calculator extends JFrame{
	public JButton menuButton;
	public JButton addButton;
	public JButton subButton;
	public JButton multiButton;
	public JButton divButton;
	public JTextField firstNum;
	public JTextField secondNum;
	public JTextField Answer;
	public JLabel AnswerLabel;
	
	public Calculator(){
		this.setTitle("Calculator");
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
		
		this.menuButton = new JButton();
		this.menuButton.setText("Menu");
		this.menuButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				menuButton_ActionPerformed();
			}
		});

		
		this.addButton = new JButton();
		this.addButton.setText("+");
		this.addButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				addButton_ActionPerformed();
			}
		});
		
		this.subButton = new JButton();
		this.subButton.setText("-");
		this.subButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				subButton_ActionPerformed();
			}
		});
		
		this.multiButton = new JButton();
		this.multiButton.setText("*");
		this.multiButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				multiButton_ActionPerformed();
			}
		});
		
		this.divButton = new JButton();
		this.divButton.setText("/");
		this.divButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				divButton_ActionPerformed();
			}
		});
		
		this.firstNum = new JTextField();
		this.firstNum.setText("		  ");
		
		this.secondNum = new JTextField();
		this.secondNum.setText("		  ");
		
		this.Answer = new JTextField();
		this.Answer.setText("		  ");
		this.Answer.setEditable(false);
		
		this.AnswerLabel = new JLabel();
		this.AnswerLabel.setText("Answer: ");
		
		
		add(addButton);
		add(subButton);
		add(multiButton);
		add(divButton);
		add(menuButton);
		add(firstNum);
		add(secondNum);
		add(AnswerLabel);
		add(Answer);
		
	}
	private void Calc_Load(){
		firstNum.setText("");
		secondNum.setText("");
		Answer.setText("");
		
	}
	
	private void addButton_ActionPerformed(){
		try{
			double num1,num2;
			num1 = Double.parseDouble(firstNum.getText());
			num2 = Double.parseDouble(secondNum.getText());
			double Answer2 = num1+num2;
			Answer.setText(String.valueOf(Answer2));
		}
		catch(Exception ex){
			JOptionPane.showMessageDialog(null, "Invaild Numbers");
		}
	}

	private void subButton_ActionPerformed(){
		try{
			double num1,num2;
			num1 = Double.parseDouble(firstNum.getText());
			num2 = Double.parseDouble(secondNum.getText());
			double Answer2 = num1-num2;
			Answer.setText(String.valueOf(Answer2));
		}
		catch(Exception ex){
			JOptionPane.showMessageDialog(null, "Invaild Numbers");
		}
	}
	
	private void multiButton_ActionPerformed(){
		try{
			double num1,num2;
			num1 = Double.parseDouble(firstNum.getText());
			num2 = Double.parseDouble(secondNum.getText());
			double Answer2 = num1*num2;
			Answer.setText(String.valueOf(Answer2));
		}
		catch(Exception ex){
			JOptionPane.showMessageDialog(null, "Invaild Numbers");
		}
	}
	
	private void divButton_ActionPerformed(){
		try{
			double num1,num2;
			num1 = Double.parseDouble(firstNum.getText());
			num2 = Double.parseDouble(secondNum.getText());
			double Answer2 = num1/num2;
			Answer.setText(String.valueOf(Answer2));
		}
		catch(Exception ex){
			JOptionPane.showMessageDialog(null, "Invaild Numbers");
		}
	}
	
	private void menuButton_ActionPerformed(){
		try{
			menu newform = new menu();
			newform.setVisible(true);
			this.setVisible(false);
		}
		catch(Exception ex){
			JOptionPane.showMessageDialog(null, "Error_101");
		}
	}
	
}
