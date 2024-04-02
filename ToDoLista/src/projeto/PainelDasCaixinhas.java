package projeto;



import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class PainelDasCaixinhas extends JPanel implements ActionListener{
	private List<JCheckBox> caixinhas = new ArrayList<>();
	private JTextField text;
	private static final int posicaoX = 0;
	private static final int posicaoY = 0;
	private static final int tamanhoHorizontal = 350;
	private static final int tamanhoVertical = 500;
	
	private static final int Linhas = 10;
	private static final int Colunas = 1;
	
	
	
	PainelDasCaixinhas(JTextField text){
		this.setJTextField(text);
		
		this.setBounds(posicaoX, posicaoY,tamanhoHorizontal,tamanhoVertical);
		this.setBackground(new Color(250,128,114));
		this.setLayout(new GridLayout(Linhas,Colunas));
	}
	
	public void setJTextField(JTextField text) {
		this.text = text;
		this.text.setFont(new Font("Arial",Font.BOLD,20));
		this.text.addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == text && caixinhas.size() < Linhas) {
			if(!text.getText().equals("")) {
				caixinhas.add(new Caixinha(text.getText()));
				for(JCheckBox check: caixinhas) {
					check.addActionListener(this);
					add(check);
				}
			}
		}
		
		for(int i = 0; i < caixinhas.size();i++) {
			if(e.getSource() == caixinhas.get(i)) {
				if(caixinhas.get(i).isSelected() == true) {
					this.remove(caixinhas.get(i));
					caixinhas.remove(i);
				}
			}
		}
		
		if(caixinhas.size() < Linhas) {
			text.setEditable(true);
			text.setText("");
		} else if(caixinhas.size() >= Linhas) {
			text.setEditable(false);
			text.setText("Máximo de Tarefas Alcançado.");
		}
		
		this.setVisible(false);
		this.setVisible(true);
	}
}
