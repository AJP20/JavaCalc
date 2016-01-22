import java.awt.*;

import java.awt.event.*;

import javax.swing.*;
public class trig extends JFrame{
	
	public JButton homeButton;
	public JButton backButton;
	public JButton answerButton;
	public JButton xq;
	public JButton yq;
	public JButton rq;
	public JTextField x;
	public JTextField y;
	public JTextField r;
	public JTextField d;
	public JTextField sin;
	public JTextField cos;
	public JTextField tan;
	public JTextField csc;
	public JTextField sec;
	public JTextField cot;
	public JLabel xLabel;
	public JLabel yLabel;
	public JLabel rLabel;
	public JLabel dLabel;
	
	public trig() {
		
		this.setTitle("6Trig");
		this.setSize(new Dimension(250,375));
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
		
		this.xq = new JButton();
		this.xq.setText("?");
		this.xq.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				xq_ActionPerformed();
			}
		});
		
		this.yq = new JButton();
		this.yq.setText("?");
		this.yq.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				yq_ActionPerformed();
			}
		});
		
		this.rq = new JButton();
		this.rq.setText("?");
		this.rq.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				rq_ActionPerformed();
			}
		});
		
		this.xLabel = new JLabel();
		this.xLabel.setText("X:");
		
		this.x = new JTextField();
		this.x.setText("	                          ");
		
		this.yLabel = new JLabel();
		this.yLabel.setText("Y:");
		
		this.y = new JTextField();
		this.y.setText("	                          ");
		
		this.rLabel = new JLabel();
		this.rLabel.setText("R:");
		
		this.r = new JTextField();
		this.r.setText("	                          ");
		
		this.dLabel = new JLabel();
		this.dLabel.setText("D:");
		
		this.d = new JTextField();
		this.d.setText("		              ");
		
		
		this.sin = new JTextField();
		this.sin.setText("		  ");
		this.sin.setEditable(false);
		
		this.cos = new JTextField();
		this.cos.setText("		  ");
		this.cos.setEditable(false);
		
		this.tan = new JTextField();
		this.tan.setText("		  ");
		this.tan.setEditable(false);
		
		this.csc = new JTextField();
		this.csc.setText("		  ");
		this.csc.setEditable(false);
		
		this.sec = new JTextField();
		this.sec.setText("		  ");
		this.sec.setEditable(false);
		
		this.cot = new JTextField();
		this.cot.setText("		  ");
		this.cot.setEditable(false);
		
		
		add(homeButton);
		add(backButton);
		add(xLabel);
		add(x);
		add(xq);
		add(yLabel);
		add(y);
		add(yq);
		add(rLabel);
		add(r);
		add(rq);
		add(dLabel);
		add(d);
		add(answerButton);
		add(sin);
		add(cos);
		add(tan);
		add(csc);
		add(sec);
		add(cot);
	}
	
	
	private void Calc_Load(){
		x.setText("");
		y.setText("");
		r.setText("");
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
	
	private void xq_ActionPerformed(){
		try{
			xq newform = new xq();
			newform.setVisible(true);
			this.setVisible(false);
			
		}
		catch(Exception ex){
			JOptionPane.showMessageDialog(null, "Error_101");
		}
	}
	
	private void yq_ActionPerformed(){
		try{
			yq newform = new yq();
			newform.setVisible(true);
			this.setVisible(false);
			
		}
		catch(Exception ex){
			JOptionPane.showMessageDialog(null, "Error_101");
		}
	}
	
	private void rq_ActionPerformed(){
		try{
			rq newform = new rq();
			newform.setVisible(true);
			this.setVisible(false);
			
		}
		catch(Exception ex){
			JOptionPane.showMessageDialog(null, "Error_101");
		}
	}
	
	private void answerButton_ActionPerformed(){
		try{
			sin.setText(String.valueOf("SINϑ= " + y.getText() + "/" +r.getText()));
			cos.setText(String.valueOf("COSϑ= " + x.getText() + "/" +r.getText()));
			tan.setText(String.valueOf("TANϑ= " + y.getText() + "/" +x.getText()));
			csc.setText(String.valueOf("CSCϑ= " + r.getText() + "/" +y.getText()));
			sec.setText(String.valueOf("SECϑ= " + r.getText() + "/" +x.getText()));
			cot.setText(String.valueOf("COTϑ= " + x.getText() + "/" +y.getText()));
			double dnum = Double.parseDouble(d.getText());
			if(dnum ==90){
				x.setText(String.valueOf(0));
				y.setText(String.valueOf(1));
				r.setText(String.valueOf(1));
				sin.setText(String.valueOf("SINϑ= " + y.getText() + "/" +r.getText()));
				cos.setText(String.valueOf("COSϑ= " + x.getText() + "/" +r.getText()));
				tan.setText(String.valueOf("TANϑ= " + y.getText() + "/" +x.getText()));
				csc.setText(String.valueOf("CSCϑ= " + r.getText() + "/" +y.getText()));
				sec.setText(String.valueOf("SECϑ= " + r.getText() + "/" +x.getText()));
				cot.setText(String.valueOf("COTϑ= " + x.getText() + "/" +y.getText()));
			}
			if(dnum ==0){
				x.setText(String.valueOf(1));
				y.setText(String.valueOf(0));
				r.setText(String.valueOf(1));
				sin.setText(String.valueOf("SINϑ= " + y.getText() + "/" +r.getText()));
				cos.setText(String.valueOf("COSϑ= " + x.getText() + "/" +r.getText()));
				tan.setText(String.valueOf("TANϑ= " + y.getText() + "/" +x.getText()));
				csc.setText(String.valueOf("CSCϑ= " + r.getText() + "/" +y.getText()));
				sec.setText(String.valueOf("SECϑ= " + r.getText() + "/" +x.getText()));
				cot.setText(String.valueOf("COTϑ= " + x.getText() + "/" +y.getText()));
			}
			if(dnum ==180){
				x.setText(String.valueOf(-1));
				y.setText(String.valueOf(0));
				r.setText(String.valueOf(1));
				sin.setText(String.valueOf("SINϑ= " + y.getText() + "/" +r.getText()));
				cos.setText(String.valueOf("COSϑ= " + x.getText() + "/" +r.getText()));
				tan.setText(String.valueOf("TANϑ= " + y.getText() + "/" +x.getText()));
				csc.setText(String.valueOf("CSCϑ= " + r.getText() + "/" +y.getText()));
				sec.setText(String.valueOf("SECϑ= " + r.getText() + "/" +x.getText()));
				cot.setText(String.valueOf("COTϑ= " + x.getText() + "/" +y.getText()));
			}
			if(dnum ==270){
				x.setText(String.valueOf(0));
				y.setText(String.valueOf(-1));
				r.setText(String.valueOf(1));
				sin.setText(String.valueOf("SINϑ= " + y.getText() + "/" +r.getText()));
				cos.setText(String.valueOf("COSϑ= " + x.getText() + "/" +r.getText()));
				tan.setText(String.valueOf("TANϑ= " + y.getText() + "/" +x.getText()));
				csc.setText(String.valueOf("CSCϑ= " + r.getText() + "/" +y.getText()));
				sec.setText(String.valueOf("SECϑ= " + r.getText() + "/" +x.getText()));
				cot.setText(String.valueOf("COTϑ= " + x.getText() + "/" +y.getText()));
			}
			if(dnum ==360){
				x.setText(String.valueOf(1));
				y.setText(String.valueOf(0));
				r.setText(String.valueOf(1));
				sin.setText(String.valueOf("SINϑ= " + y.getText() + "/" +r.getText()));
				cos.setText(String.valueOf("COSϑ= " + x.getText() + "/" +r.getText()));
				tan.setText(String.valueOf("TANϑ= " + y.getText() + "/" +x.getText()));
				csc.setText(String.valueOf("CSCϑ= " + r.getText() + "/" +y.getText()));
				sec.setText(String.valueOf("SECϑ= " + r.getText() + "/" +x.getText()));
				cot.setText(String.valueOf("COTϑ= " + x.getText() + "/" +y.getText()));
			}
		}
		catch(Exception ex){
			
		}
	
	}
}