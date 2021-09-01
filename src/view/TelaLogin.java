package view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TelaLogin extends JFrame {
	JLabel loginLabel, senhalaLabel;
	JTextField loginField, senhaField;
	JButton confirmabuButton;
	
	public JLabel getLoginLabel() {
		return loginLabel;
	}

	public JLabel getSenhalaLabel() {
		return senhalaLabel;
	}

	public JTextField getLoginField() {
		return loginField;
	}

	public JTextField getSenhaField() {
		return senhaField;
	}

	public JButton getConfirmabuButton() {
		return confirmabuButton;
	}

	public TelaLogin() {
		super("Pet Shop");
		
		setSize(200, 205);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		
		
		loginLabel = new JLabel("Login: ");
		senhalaLabel = new JLabel("Senha: ");
		loginField = new JTextField(10);
		senhaField = new JPasswordField(10);
		confirmabuButton = new  JButton("Confirmar");
		confirmabuButton.setBackground(Color.white);
		confirmabuButton.setFont( new Font("Arial", Font.BOLD, 15));
		loginLabel.setBackground(Color.black);
		loginLabel.setFont(new Font("Arial", Font.ITALIC, 15));
		senhalaLabel.setBackground(Color.black);
		senhalaLabel.setFont(new Font("Arial",Font.ITALIC, 15));
		
		add(loginLabel);
		add(loginField);
		add(senhalaLabel);
		add(senhaField);
		add(confirmabuButton);
		
		setVisible(true);
	}

}
