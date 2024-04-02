package projeto;



import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class PainelDasTarefas extends JPanel{
	private JTextField text = new JTextField();
	private static final int posicaoX = 15;
	private static final int posicaoY = 75;
	private static final int tamanhoHorizontal = 350;
	private static final int tamanhoVertical = 600;
	
	
	PainelDasTarefas(){
		this.setBackground(new Color(250,128,114));
		this.setBounds(posicaoX, posicaoY,tamanhoHorizontal,tamanhoVertical);
		this.setLayout(null);
		this.add(getJTextField());
		this.add(new PainelDasCaixinhas(text));
	}
	
	public JTextField getJTextField() {
		text.setBounds(0, 500, 350,50);
		return text;
	}
}