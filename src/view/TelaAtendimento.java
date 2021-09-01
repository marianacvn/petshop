package view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class TelaAtendimento extends JFrame {
	JLabel mensagemLabel, mensagem2Label;
	JButton banhoButton, tosaButton, banhoetosaButton;
	
	public JLabel getMensagemLabel() {
		return mensagemLabel;
	}

	public JLabel getMensagem2Label() {
		return mensagem2Label;
	}

	public JButton getBanhoButton() {
		return banhoButton;
	}

	public JButton getTosaButton() {
		return tosaButton;
	}

	public JButton getBanhoetosaButton() {
		return banhoetosaButton;
	}

	public TelaAtendimento() {
		super("Atendimento");
		
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		setSize(160, 160);
		
		mensagemLabel = new JLabel("SEJAM BEM-VINDOS!");
		mensagem2Label = new JLabel("  		Serviços: ");
		banhoButton = new JButton("Banho");
		tosaButton = new JButton("Tosa");
		banhoetosaButton = new JButton("Banho e Tosa");
		
		add(mensagemLabel);
		add(mensagem2Label);
		add(banhoButton);
		add(tosaButton);
		add(banhoetosaButton);
		
		
		setVisible(false);
	}

}
