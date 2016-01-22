import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class righttri extends JFrame{
	
	public JButton homeButton;
	public JButton backButton;
	public JButton answerButton;
	public JTextField aa;
	public JTextField ab;
	public JTextField ac;
	public JTextField aA;
	public JTextField aB;
	public JTextField aC;
	public JTextField d;
	public JTextField a;
	public JTextField b;
	public JTextField c;
	public JTextField A;
	public JTextField B;
	public JTextField C;
	public JLabel aLabel;
	public JLabel bLabel;
	public JLabel cLabel;
	public JLabel ALabel;
	public JLabel BLabel;
	public JLabel CLabel;
	
	public righttri() {
		
		this.setTitle("Triangle Solver");
		this.setSize(new Dimension(250,450));
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
		
		
		
		this.aLabel = new JLabel();
		this.aLabel.setText("a:");
		
		this.a = new JTextField();
		this.a.setText("		              ");
		
		this.bLabel = new JLabel();
		this.bLabel.setText("b:");
		
		this.b = new JTextField();
		this.b.setText("		              ");
		
		this.cLabel = new JLabel();
		this.cLabel.setText("c:");
		
		this.c = new JTextField();
		this.c.setText("		              ");
		
		this.ALabel = new JLabel();
		this.ALabel.setText("A:");
		
		this.A = new JTextField();
		this.A.setText("		              ");
		
		this.BLabel = new JLabel();
		this.BLabel.setText("B:");
		
		this.B = new JTextField();
		this.B.setText("		              ");
		
		this.CLabel = new JLabel();
		this.CLabel.setText("C:");
		
		this.C = new JTextField();
		this.C.setText("		              ");
		
		
		this.aa = new JTextField();
		this.aa.setText("		  ");
		this.aa.setEditable(false);
		
		this.ab = new JTextField();
		this.ab.setText("		  ");
		this.ab.setEditable(false);
		
		this.ac = new JTextField();
		this.ac.setText("		  ");
		this.ac.setEditable(false);
		
		this.aA = new JTextField();
		this.aA.setText("		  ");
		this.aA.setEditable(false);
		
		this.aB = new JTextField();
		this.aB.setText("		  ");
		this.aB.setEditable(false);
		
		this.aC = new JTextField();
		this.aC.setText("		  ");
		this.aC.setEditable(false);
		
		
		add(homeButton);
		add(backButton);
		add(aLabel);
		add(a);
		add(bLabel);
		add(b);
		add(cLabel);
		add(c);
		add(ALabel);
		add(A);
		add(BLabel);
		add(B);
		add(CLabel);
		add(C);
		add(answerButton);
		add(aa);
		add(ab);
		add(ac);
		add(aA);
		add(aB);
		add(aC);
	}
	
	
	private void Calc_Load(){
		a.setText("0");
		b.setText("0");
		c.setText("0");
		A.setText("0");
		B.setText("0");
		C.setText("0");
		
			
		
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
			double anum = Double.parseDouble(a.getText());
			double bnum = Double.parseDouble(b.getText());
			double cnum = Double.parseDouble(c.getText());
			double Anum = Double.parseDouble(A.getText());
			double Bnum = Double.parseDouble(B.getText());
			double Cnum = Double.parseDouble(C.getText());
			if((anum>0) && (Anum>0) && (Bnum>0)){
				
				double rAnum = (Anum * 0.0174532925);
				double base = ((anum)/(Math.sin(rAnum)));
				
				double answera=(anum);
				
				double rBnum = (Bnum * 0.0174532925);
				double answerb=(base * (Math.sin(rBnum)));
				
				double trisides = (Bnum + Anum);
				double C1num = (180-trisides);
				double dCnum = (C1num * 0.0174532925);
				double answerc = (base * (Math.sin(dCnum)));
				double answerA=(Anum);
				double answerB=(Bnum);
				double answerC=(C1num);
				
				
				aa.setText(String.valueOf("a = "+answera));
				ab.setText(String.valueOf("b = "+answerb));
				ac.setText(String.valueOf("c = "+answerc));
				aA.setText(String.valueOf("A = "+answerA));
				aB.setText(String.valueOf("B = "+answerB));
				aC.setText(String.valueOf("C = "+answerC));
				
			}
			if((anum>0) && (Anum>0) && (Cnum>0)){
				
				double rAnum = (Anum * 0.0174532925);
				double base = ((anum)/(Math.sin(rAnum)));
				
				double answera=(anum);
				
				double rCnum = (Cnum * 0.0174532925);
				double answerc=(base * (Math.sin(rCnum)));
				
				double trisides = (Cnum + Anum);
				double B1num = (180-trisides);
				double dBnum = (B1num * 0.0174532925);
				double answerb = (base * (Math.sin(dBnum)));
				double answerA=(Anum);
				double answerB=(B1num);
				double answerC=(Cnum);
				
				
				aa.setText(String.valueOf("a = "+answera));
				ab.setText(String.valueOf("b = "+answerb));
				ac.setText(String.valueOf("c = "+answerc));
				aA.setText(String.valueOf("A = "+answerA));
				aB.setText(String.valueOf("B = "+answerB));
				aC.setText(String.valueOf("C = "+answerC));
				
			}
			if((bnum>0) && (Bnum>0) && (Anum>0)){
				
				double rBnum = (Bnum * 0.0174532925);
				double base = ((bnum)/(Math.sin(rBnum)));
				
				double answerb=(bnum);
				
				double rAnum = (Anum * 0.0174532925);
				double answera=(base * (Math.sin(rAnum)));
				
				double trisides = (Bnum + Anum);
				double C1num = (180-trisides);
				double dCnum = (C1num * 0.0174532925);
				double answerc = (base * (Math.sin(dCnum)));
				double answerA=(Anum);
				double answerB=(Bnum);
				double answerC=(C1num);
				
				
				aa.setText(String.valueOf("a = "+answera));
				ab.setText(String.valueOf("b = "+answerb));
				ac.setText(String.valueOf("c = "+answerc));
				aA.setText(String.valueOf("A = "+answerA));
				aB.setText(String.valueOf("B = "+answerB));
				aC.setText(String.valueOf("C = "+answerC));
				
			}
			if((bnum>0) && (Bnum>0) && (Cnum>0)){
				
				double rBnum = (Bnum * 0.0174532925);
				double base = ((bnum)/(Math.sin(rBnum)));
				
				double answerb=(bnum);
				
				double rCnum = (Cnum * 0.0174532925);
				double answerc=(base * (Math.sin(rCnum)));
				
				double trisides = (Bnum + Cnum);
				double A1num = (180-trisides);
				double dAnum = (A1num * 0.0174532925);
				double answera = (base * (Math.sin(dAnum)));
				double answerA=(A1num);
				double answerB=(Bnum);
				double answerC=(Cnum);
				
				
				aa.setText(String.valueOf("a = "+answera));
				ab.setText(String.valueOf("b = "+answerb));
				ac.setText(String.valueOf("c = "+answerc));
				aA.setText(String.valueOf("A = "+answerA));
				aB.setText(String.valueOf("B = "+answerB));
				aC.setText(String.valueOf("C = "+answerC));
				
			}
			if((cnum>0) && (Cnum>0) && (Anum>0)){
				
				double rCnum = (Cnum * 0.0174532925);
				double base = ((cnum)/(Math.sin(rCnum)));
				
				double answerc=(cnum);
				
				double rAnum = (Anum * 0.0174532925);
				double answera=(base * (Math.sin(rAnum)));
				
				double trisides = (Anum + Cnum);
				double B1num = (180-trisides);
				double dAnum = (B1num * 0.0174532925);
				double answerb = (base * (Math.sin(dAnum)));
				double answerA=(Anum);
				double answerB=(B1num);
				double answerC=(Cnum);
				
				
				aa.setText(String.valueOf("a = "+answera));
				ab.setText(String.valueOf("b = "+answerb));
				ac.setText(String.valueOf("c = "+answerc));
				aA.setText(String.valueOf("A = "+answerA));
				aB.setText(String.valueOf("B = "+answerB));
				aC.setText(String.valueOf("C = "+answerC));
				
			}
			if((anum>0) && (bnum>0) && (Anum>0)){
				
				double rAnum = (Anum * 0.0174532925);
				double base = ((anum)/(Math.sin(rAnum)));
				
				double answera=(anum);
				double answerb=(bnum);
				double answerA=(Anum);
				double answerB=((Math.asin(bnum/base))* 57.2957795);
				double answerC=(180-(answerA+answerB));
				double answerc=((Math.sin(answerC * 0.0174532925))* base);
				
				
				aa.setText(String.valueOf("a = "+answera));
				ab.setText(String.valueOf("b = "+answerb));
				ac.setText(String.valueOf("c = "+answerc));
				aA.setText(String.valueOf("A = "+answerA));
				aB.setText(String.valueOf("B = "+answerB));
				aC.setText(String.valueOf("C = "+answerC));
				
			}
			if((anum>0) && (cnum>0) && (Anum>0)){
				
				double rAnum = (Anum * 0.0174532925);
				double base = ((anum)/(Math.sin(rAnum)));
				
				double answera=(anum);
				double answerc=(cnum);
				double answerA=(base);
				double answerC=((Math.asin(cnum/base)));
				double answerB=(180-(answerA+answerC));
				double answerb=((Math.sin(answerB * 0.0174532925))* base);
				
				
				aa.setText(String.valueOf("a = "+answera));
				ab.setText(String.valueOf("b = "+answerb));
				ac.setText(String.valueOf("c = "+answerc));
				aA.setText(String.valueOf("A = "+answerA));
				aB.setText(String.valueOf("B = "+answerB));
				aC.setText(String.valueOf("C = "+answerC));
				
			}
		}
		catch(Exception ex){
			
		}
	
}
}