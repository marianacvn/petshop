package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.BaseDados;
import model.Usuario;
import view.TelaAtendimento;
import view.TelaLogin;
import view.TelaPagamento;

public class Controle implements ActionListener{
	TelaAtendimento tela2;
	TelaPagamento tela3;
	TelaLogin tela1;
	
	
	public Controle(TelaAtendimento tela2, TelaPagamento tela3, TelaLogin tela1) {
		super();
		this.tela2 = tela2;
		this.tela3 = tela3;
		this.tela1 = tela1;
		tela1.getConfirmabuButton().addActionListener(this);
		tela2.getBanhoButton().addActionListener(this);
		tela2.getTosaButton().addActionListener(this);
		tela2.getBanhoetosaButton().addActionListener(this);
		tela3.getConfirmaButton().addActionListener(this);
		tela3.getSairButton().addActionListener(this);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(tela1.getConfirmabuButton() == e.getSource()) {
			String login = tela1.getLoginField().getText();
			String senha = tela1.getSenhaField().getText();
			Usuario usuario = new Usuario(login, senha);
			if (BaseDados.verificarLogin(usuario)) {
				tela2.setVisible(true);
				tela1.setVisible(false);
			} else {
				JOptionPane.showMessageDialog(null,"Login Inválido");
			}
		
		}
		if (tela2.getBanhoButton() == e.getSource()) {
			tela3.getTotalField().setText("15");
			tela3.setVisible(true);
			tela2.setVisible(false);
		} else if (tela2.getTosaButton() == e.getSource()) {
			tela3.getTotalField().setText("30");
			tela3.setVisible(true);
			tela2.setVisible(false);
		} else if (tela2.getBanhoetosaButton() == e.getSource()) {
			tela3.getTotalField().setText("45");
			tela3.setVisible(true);
			tela2.setVisible(false);
		}
		if(tela3.getConfirmaButton() == e.getSource()) {
			float valor = Float.parseFloat(tela3.getValorField().getText());
			float total = Float.parseFloat(tela3.getTotalField().getText());
			if(valor < total) {
				JOptionPane.showMessageDialog(null, "Valor Insuficiente!");
			} else {
				float troco = valor - total;
				tela3.getTrocoField().setText(""+troco);;
				tela3.getSairButton().setVisible(true);
			}
		
		}
		if(tela3.getSairButton() == e.getSource()) {
			JOptionPane.showMessageDialog(null, "Volte Sempre!");
		}
	}
	
	

}
