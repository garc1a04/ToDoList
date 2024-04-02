package projeto;



import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Texto extends JLabel{
	private ImageIcon icon = new ImageIcon("Fotos/Foto.png");
	
	Texto(){
		this.setText("Tarefas");
		this.setFont(new Font("Comic Sans", Font.ITALIC,30));
		this.setForeground(Color.WHITE);
		this.setIcon(icon);
		this.setBounds(5,-50, 400, 200);
	}

}
