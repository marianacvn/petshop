package view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaPagamento extends JFrame {
	JLabel valorLabel, totalLabel, trocoLabel;
	JTextField valorField, totalField, trocoField;
	JButton confirmaButton, sairButton;
		

	
	
	public JButton getSairButton() {
		return sairButton;
	}

	public JLabel getValorLabel() {
		return valorLabel;
	}

	public JLabel getTotalLabel() {
		return totalLabel;
	}

	public JLabel getTrocoLabel() {
		return trocoLabel;
	}

	public JTextField getValorField() {
		return valorField;
	}

	public JTextField getTotalField() {
		return totalField;
	}

	public JTextField getTrocoField() {
		return trocoField;
	}

	public JButton getConfirmaButton() {
		return confirmaButton;
	}

	public TelaPagamento() {
		super("Pagamento");
		
		
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		setSize(200, 190);
		
		valorLabel = new JLabel("Valor:");
		totalLabel = new JLabel("Total:");
		trocoLabel = new JLabel("Troco:");
		
		valorField = new JTextField(10);
		totalField = new JTextField(10);
		totalField.setEnabled(false);
		trocoField = new JTextField(10);
		trocoField.setEnabled(false);
		
		confirmaButton = new JButton("Confirmar");
		sairButton = new JButton("Sair");
		sairButton.setVisible(false);
		
		add(valorLabel);
		add(valorField);
		add(trocoLabel);
		add(trocoField);
		add(totalLabel);
		add(totalField);
		add(confirmaButton);
		add(sairButton);
		
		setVisible(false);
}
	
}
