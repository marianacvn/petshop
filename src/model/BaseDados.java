package model;

import java.util.ArrayList;

public class BaseDados {
	public static ArrayList<Usuario> usuarios = new ArrayList<>();
	
	
	public static Usuario buscarUsuario(Usuario usuario) {
		for (Usuario user : usuarios) {
			if(user.getLogin().equals(usuario.getLogin()) && user.getSenha().equals(usuario.getSenha())) {
				return user;
			}
		}
	return null;

	}
	
	public static boolean verificarLogin(Usuario usuario) {
		if(buscarUsuario(usuario) != null) {
			return true;
		}
		return false;
	}
	
	
	
}

