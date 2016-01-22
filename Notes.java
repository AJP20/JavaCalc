import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
import java.io.*;
 
public class Notes extends JFrame implements ActionListener {

    private TextArea textArea = new TextArea("", 0,0, TextArea.SCROLLBARS_VERTICAL_ONLY);
    private MenuBar menuBar = new MenuBar();
    private Menu file = new Menu();
    private Menu options = new Menu();
    private MenuItem home = new MenuItem();
    private MenuItem menu = new MenuItem();
    private MenuItem openFile = new MenuItem();
    private MenuItem saveFile = new MenuItem();
    private MenuItem close = new MenuItem();
     
    public Notes() {
    	this.setTitle("Notes");
		this.setSize(new Dimension(600,500));
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(textArea);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
 
        this.setMenuBar(this.menuBar);
        this.menuBar.add(this.file);
        this.menuBar.add(this.options);
        
        this.options.setLabel("Options");
        this.file.setLabel("File");
        
       
        this.home.setLabel("Home");
        this.home.addActionListener(this);
        this.home.setShortcut(new MenuShortcut(KeyEvent.VK_H, false));
        this.options.add(this.home);
        
        this.menu.setLabel("Menu");
        this.menu.addActionListener(this);
        this.menu.setShortcut(new MenuShortcut(KeyEvent.VK_M, false));
        this.options.add(this.menu);
        
        this.openFile.setLabel("Open");
        this.openFile.addActionListener(this);
        this.openFile.setShortcut(new MenuShortcut(KeyEvent.VK_O, false));
        this.file.add(this.openFile);
         
        this.saveFile.setLabel("Save");
        this.saveFile.addActionListener(this);
        this.saveFile.setShortcut(new MenuShortcut(KeyEvent.VK_S, false));
        this.file.add(this.saveFile);
         
        this.close.setLabel("Close");
        this.close.setShortcut(new MenuShortcut(KeyEvent.VK_F4, false));
        this.close.addActionListener(this);
        this.file.add(this.close);
    }  
    public void actionPerformed (ActionEvent e) {

        if (e.getSource() == this.close)
            this.dispose();
         
        else if (e.getSource() == this.openFile) {
            JFileChooser open = new JFileChooser();
            int option = open.showOpenDialog(this);
            if (option == JFileChooser.APPROVE_OPTION) {
                this.textArea.setText("");
                try {
                    Scanner scan = new Scanner(new FileReader(open.getSelectedFile().getPath()));
                    while (scan.hasNext())
                        this.textArea.append(scan.nextLine() + "\n");
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
         

        else if (e.getSource() == this.saveFile) {
            JFileChooser save = new JFileChooser();
            int option = save.showSaveDialog(this);
            if (option == JFileChooser.APPROVE_OPTION) {
                try {
                    BufferedWriter out = new BufferedWriter(new FileWriter(save.getSelectedFile().getPath()));
                    out.write(this.textArea.getText());
                    out.close();
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
        
        
        else if (e.getSource() == this.home) {
        Calculator h = new Calculator();
    	h.setVisible(true);
		this.setVisible(false);
        }
        else if (e.getSource() == this.menu) {
            menu h = new menu();
        	h.setVisible(true);
    		this.setVisible(false);
            }
    }
    public static void main(String args[]) {
        Notes app = new Notes();
        app.setVisible(true);
}
}
