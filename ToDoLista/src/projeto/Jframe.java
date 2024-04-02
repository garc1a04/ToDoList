package projeto;



import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Jframe extends JFrame{
	private static final int HORIZONTAL = 400;
	private static final int VERTICAL = 700;
	
	public Jframe(){	
		this.setTitle("Lista de Tarefas");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(null);
		this.setSize(HORIZONTAL,VERTICAL);
		this.setLocationRelativeTo(null);
	
		this.add(new PainelDasTarefas());
		this.add(new PainelPrincipal());
		this.setVisible(true);
	}
	
}
