package app;

import controller.Controle;
import model.BaseDados;
import model.Usuario;
import view.TelaAtendimento;
import view.TelaLogin;
import view.TelaPagamento;

public class App {
	public static void main(String[] args) {
		Usuario usuario = new Usuario("mariana", "123");
		BaseDados.usuarios.add(usuario);
		TelaLogin tela1 = new TelaLogin();
		TelaAtendimento tela2 = new TelaAtendimento();
		TelaPagamento tela3 = new TelaPagamento();
		Controle c = new Controle(tela2,tela3,tela1);
		
	}

}
