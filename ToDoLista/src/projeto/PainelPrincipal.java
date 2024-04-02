package projeto;



import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class PainelPrincipal extends JPanel{
	private static final int posicaoX = 0;
	private static final int posicaoY = 0;
	private static final int tamanhoHorizontal = 400;
	private static final int tamanhoVertical = 700;
	
	private static final int inicialX = 10;
	private static final int inicialY = 70;
	private static final int finalX = 365;
	private static final int finalY = 70;
	
	PainelPrincipal(){
		this.setBounds(posicaoX, posicaoY,tamanhoHorizontal,tamanhoVertical);
		this.setBackground(new Color(250,128,114));
		this.setLayout(null);
		this.add(new Texto());
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		draw(g);
	}
	
	private  void draw(Graphics g) {
		g.setColor(Color.DARK_GRAY);
		g.drawLine(inicialX, inicialY,finalX ,finalY);
	}
}
