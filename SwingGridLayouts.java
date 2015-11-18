import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingGridLayouts extends JFrame {
	
		private JButton btn,btn1,btn2,btn3;
		public SwingGridLayouts() {
		
			btn=new JButton("1");
			btn1=new JButton("2");
			btn2=new JButton("3");
			btn3=new JButton("4");
			
			setLayout(new GridLayout(2,2));
			add(btn);
			add(btn1);
			add(btn2);
			add(btn3);
			
		
			setVisible(true);
			setSize(new Dimension(500,500));
		

			
		}
}
