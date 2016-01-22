import java.awt.*;

import java.awt.event.*;

import javax.swing.*;
public class menu extends JFrame{
	
	public JButton homeButton;
	public JButton notesButton;
	public JButton sqrtButton;
	public JButton cbrtButton;
	public JButton SFSButton;
	public JButton LOGButton;
	public JButton AntiLOGButton;
	public JButton LNButton;
	public JButton antiLNButton;
	public JButton pertButton;
	public JButton prntButton;
	public JButton sinButton;
	public JButton cosButton;
	public JButton tanButton;
	public JButton trigButton;
	public JButton drButton;
	public JButton tsButton;
	
	
	public menu(){
		this.setTitle("Menu");
		this.setSize(new Dimension(350,400));
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		this.setLayout(new FlowLayout());
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		this.homeButton = new JButton();
		this.homeButton.setText("        Home        ");
		this.homeButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				homeButton_ActionPerformed();
			}
		});
		
		this.notesButton = new JButton();
		this.notesButton.setText("         Notes         ");
		this.notesButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				notesButton_ActionPerformed();
			}
		});
		
		this.sqrtButton = new JButton();
		this.sqrtButton.setText("  Square Root  ");
		this.sqrtButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				sqrtButton_ActionPerformed();
			}
		});
		
		this.cbrtButton = new JButton();
		this.cbrtButton.setText("    Cube Root   ");
		this.cbrtButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				cbrtButton_ActionPerformed();
			}
		});
		
		
		this.SFSButton = new JButton();
		this.SFSButton.setText("              Standard Form Solver             ");
		this.SFSButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				SFSButton_ActionPerformed();
			}
		});
		
		
		this.LOGButton = new JButton();
		this.LOGButton.setText("LOG");
		this.LOGButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				LOGButton_ActionPerformed();
			}
		});
		
		this.AntiLOGButton = new JButton();
		this.AntiLOGButton.setText("AntiLOG");
		this.AntiLOGButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				antiLOGButton_ActionPerformed();
			}
		});
		this.LNButton = new JButton();
		this.LNButton.setText("LN");
		this.LNButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				LNButton_ActionPerformed();
			}
		});
		this.antiLNButton = new JButton();
		this.antiLNButton.setText("AntiLN");
		this.antiLNButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				antiLNButton_ActionPerformed();
			}
		});
		this.sinButton = new JButton();
		this.sinButton.setText("SIN");
		this.sinButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				sinButton_ActionPerformed();
			}
		});
		this.cosButton = new JButton();
		this.cosButton.setText("COS");
		this.cosButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				cosButton_ActionPerformed();
			}
		});
		this.tanButton = new JButton();
		this.tanButton.setText("TAN");
		this.tanButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tanButton_ActionPerformed();
			}
		});
		this.pertButton = new JButton();
		this.pertButton.setText("PERT");
		this.pertButton.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
				pertButton_ActionPerformed();
			}
		});
		this.prntButton = new JButton();
		this.prntButton.setText("PRNT");
		this.prntButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				prntButton_ActionPerformed();
			}
		});
		this.trigButton = new JButton();
		this.trigButton.setText("6Trig");
		this.trigButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				trigButton_ActionPerformed();
			}
		});
		
		this.drButton = new JButton();
		this.drButton.setText("                Degrees to Radians                ");
		this.drButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				drButton_ActionPerformed();
			}
		});
		
		this.tsButton = new JButton();
		this.tsButton.setText("Triangle Solver");
		this.tsButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tsButton_ActionPerformed();
			}
		});
		
		
		
		
		add(homeButton);
		add(notesButton);
		add(sqrtButton);
		add(cbrtButton);
		add(SFSButton);
		add(LOGButton);
		add(AntiLOGButton);
		add(LNButton);
		add(antiLNButton);
		add(sinButton);
		add(cosButton);
		add(tanButton);
		add(drButton);
		add(pertButton);
		add(prntButton);
		add(trigButton);
		add(tsButton);
		
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
	private void notesButton_ActionPerformed(){
		try{
			Notes newform = new Notes();
			newform.setVisible(true);
			this.setVisible(false);
			
		}
		catch(Exception ex){
			JOptionPane.showMessageDialog(null, "Error_101");
		}
	}
	
	private void sqrtButton_ActionPerformed(){
		try{
			sqrt newform = new sqrt();
			newform.setVisible(true);
			this.setVisible(false);
			
		}
		catch(Exception ex){
			JOptionPane.showMessageDialog(null, "Error_102");
		}
	}
	
	private void cbrtButton_ActionPerformed(){
		try{
			cbrt newform = new cbrt();
			newform.setVisible(true);
			this.setVisible(false);
			
		}
		catch(Exception ex){
			JOptionPane.showMessageDialog(null, "Error_102");
		}
	}
	
	private void SFSButton_ActionPerformed(){
		try{
			SFS newform = new SFS();
			newform.setVisible(true);
			this.setVisible(false);
			
		}
		catch(Exception ex){
			JOptionPane.showMessageDialog(null, "Error_102");
		}
	}
	
	private void LOGButton_ActionPerformed(){
		try{
			LOG newform = new LOG();
			newform.setVisible(true);
			this.setVisible(false);
			
		}
		catch(Exception ex){
			JOptionPane.showMessageDialog(null, "Error_103");
		}
	}
	
	private void antiLOGButton_ActionPerformed(){
		try{
			AntiLOG newform = new AntiLOG();
			newform.setVisible(true);
			this.setVisible(false);
			
		}
		catch(Exception ex){
			JOptionPane.showMessageDialog(null, "Error_103");
		}
	}
	
private void LNButton_ActionPerformed(){
	try{
		LN newform = new LN();
		newform.setVisible(true);
		this.setVisible(false);
		
	}
	catch(Exception ex){
		JOptionPane.showMessageDialog(null, "Error_103");
	}
}
private void antiLNButton_ActionPerformed(){
	try{
		antiLN newform = new antiLN();
		newform.setVisible(true);
		this.setVisible(false);
		
	}
	catch(Exception ex){
		JOptionPane.showMessageDialog(null, "Error_103");
	}
}

private void sinButton_ActionPerformed(){
	try{
		sin newform = new sin();
		newform.setVisible(true);
		this.setVisible(false);
		
	}
	catch(Exception ex){
		JOptionPane.showMessageDialog(null, "Error_103");
	}
}

private void cosButton_ActionPerformed(){
	try{
		cos newform = new cos();
		newform.setVisible(true);
		this.setVisible(false);
		
	}
	catch(Exception ex){
		JOptionPane.showMessageDialog(null, "Error_103");
	}
}

private void pertButton_ActionPerformed(){
	try{
		pert newform = new pert();
		newform.setVisible(true);
		this.setVisible(false);
		
	}
	catch(Exception ex){
		JOptionPane.showMessageDialog(null, "Error_103");
	}
}
private void prntButton_ActionPerformed(){
	try{
		prnt newform = new prnt();
		newform.setVisible(true);
		this.setVisible(false);
		
	}
	catch(Exception ex){
		JOptionPane.showMessageDialog(null, "Error_103");
	}
}
private void tanButton_ActionPerformed(){
	try{
		tan newform = new tan();
		newform.setVisible(true);
		this.setVisible(false);
		
	}
	catch(Exception ex){
		JOptionPane.showMessageDialog(null, "Error_103");
	}
}

private void trigButton_ActionPerformed(){
	try{
		trig newform = new trig();
		newform.setVisible(true);
		this.setVisible(false);
		
	}
	catch(Exception ex){
		JOptionPane.showMessageDialog(null, "Error_103");
	}
}

private void drButton_ActionPerformed(){
	try{
		dr newform = new dr();
		newform.setVisible(true);
		this.setVisible(false);
		
	}
	catch(Exception ex){
		JOptionPane.showMessageDialog(null, "Error_103");
	}
}
private void tsButton_ActionPerformed(){
	try{
		righttri newform = new righttri();
		newform.setVisible(true);
		this.setVisible(false);
		
	}
	catch(Exception ex){
		JOptionPane.showMessageDialog(null, "Error_103");
	}
}

}
