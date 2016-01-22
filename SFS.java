import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class SFS extends JFrame{
	
	public JButton homeButton;
	public JButton backButton;
	public JButton answerButton;
	public JTextField a;
	public JTextField b;
	public JTextField c;
	public JTextField x1;
	public JTextField x2;
	public JTextField v;
	public JTextField d;
	public JLabel aLabel;
	public JLabel bLabel;
	public JLabel cLabel;
	
	
	
	public SFS(){
		this.setTitle("Standard Form Solver");
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
		
		
		this.answerButton = new JButton();
		this.answerButton.setText("Answer");
		this.answerButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				answerButton_ActionPerformed();
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
		
		
		this.aLabel = new JLabel();
		this.aLabel.setText("A:");
		
		this.a = new JTextField();
		this.a.setText("		              ");
		
		this.bLabel = new JLabel();
		this.bLabel.setText("B:");
		
		this.b = new JTextField();
		this.b.setText("		              ");
		
		this.cLabel = new JLabel();
		this.cLabel.setText("C:");
		
		this.c = new JTextField();
		this.c.setText("		              ");
		
		this.x1 = new JTextField();
		this.x1.setText("		  ");
		this.x1.setEditable(false);
		
		this.x2 = new JTextField();
		this.x2.setText("		  ");
		this.x2.setEditable(false);
		
		this.v = new JTextField();
		this.v.setText("		  ");
		this.v.setEditable(false);
		
		this.d = new JTextField();
		this.d.setText("		  ");
		this.d.setEditable(false);

		
		
		add(homeButton);
		add(backButton);
		add(aLabel);
		add(a);
		add(bLabel);
		add(b);
		add(cLabel);
		add(c);
		add(answerButton);
		add(x1);
		add(x2);
		add(v);
		add(d);
		
		
		
	}

	private void Calc_Load(){
		a.setText("");
		b.setText("");
		c.setText("");
		x1.setText("");
		x2.setText("");
		v.setText("");
		d.setText("");
			
		
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
			double num1,num2,num3;
			num1 = Double.parseDouble(a.getText());
			num2 = Double.parseDouble(b.getText());
			num3 = Double.parseDouble(c.getText());
			double Answer2 = (-num2 +(Math.sqrt(num2 * num2 - (4 * num1 * num3)))) / (2 * num1);
			double Answer3 = (-num2 -(Math.sqrt(num2 * num2 - (4 * num1 * num3)))) / (2 * num1);
			double Answer4 = (-num2 / (2 * num1));
			double Answer5 = (num2 * num2)- (4 * num1 * num3);
			
			x1.setText(String.valueOf("x = " + Answer2));
			x2.setText(String.valueOf("x = " + Answer3));
			v.setText(String.valueOf("Vertex = " + Answer4));
			d.setText(String.valueOf("Discriminate = " + Answer5));
			
			
		}
		catch(Exception ex){
			JOptionPane.showMessageDialog(null, "Invalid Numbers");
		}
	}
	
	
}
