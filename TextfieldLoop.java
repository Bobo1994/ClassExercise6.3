import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class TextfieldsLoop {
	private final static int SIZE=4;
	private static JPanel panel;
	
	private static JButton btn,btn1,btn2,btn3;
	public static void main(String[] args) {
		JFrame frame =new JFrame();
		 panel =new JPanel();
			 
		btn=new JButton("Textfields");
		btn1=new JButton("Borderlayout");
		btn2=new JButton("Flowlayout");
		btn3=new JButton("Gridlayout");
		//btn4=new JButton("5");
		JTextField[] fields = new JTextField[SIZE];
		for (int i = 0; i < fields.length; i++) {
		   fields[i] = new JTextField("Field " + i);
		 panel.add(fields[i]);
		}
		panel.setSize(new Dimension(200,200));
		

		
		frame.setSize(new Dimension(800,800));
		frame.add(panel);
		frame.setVisible(true);
		
	}

}
