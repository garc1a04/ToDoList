package projeto;



import java.awt.Color;
import java.awt.Font;

import javax.swing.JCheckBox;

@SuppressWarnings("serial")
public class Caixinha extends JCheckBox{
	
	public Caixinha(String text){
		this.setText(text);
		this.setFont(new Font("Arial",Font.ITALIC,20));
		this.setBackground(new Color(250,128,114));
	}
}
