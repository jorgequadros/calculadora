package br.cod3r.com.calc.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import br.cod3r.com.calc.modelo.Memoria;
import br.cod3r.com.calc.modelo.MemoriaObservador;

public class Display extends JPanel implements MemoriaObservador{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JLabel label;
	
	public Display() {
		setBackground(new Color(46,49,50));
		Memoria.getInstancia().adicionarObservador(this);
		label = new JLabel(Memoria.getInstancia().getTextoAtual());
		label.setForeground(Color.WHITE);
		label.setFont(new Font("courier", Font.PLAIN, 30));
		
		setLayout(new FlowLayout(FlowLayout.RIGHT,10,25));
		add(label);
	}
	
	@Override
	public void valorAlterado(String novoValor) {
	
		label.setText(novoValor);
	}
}
