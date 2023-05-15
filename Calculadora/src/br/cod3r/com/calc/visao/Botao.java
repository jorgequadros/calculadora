package br.cod3r.com.calc.visao;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class Botao extends JButton {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Botao(String texto, Color cor) {
		setText(texto);
		setOpaque(true);
		setBackground(cor);
		setForeground(Color.WHITE);
		setFont(new Font("courier", Font.PLAIN, 25));
		setBorder(BorderFactory.createLineBorder(Color.BLACK));
	}

}