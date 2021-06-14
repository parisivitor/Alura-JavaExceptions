package br.com.alura.exception.teste;

import br.com.alura.exception.modelo.Conexao;
import br.com.alura.exception.modelo.Conta;

public class TesteConexao {

	public static void main(String[] args) {
		try (Conexao con = new Conexao()) {
			con.leDados();
		} catch (IllegalStateException e) {
			System.out.println("Deu erro na conexao!");
		}

		try {
			Conta c = new Conta(133, -111);
		} catch (IllegalArgumentException e) {
			System.out.println("Excepption: " + e.getMessage());
		}

//		
//		Conexao con = null;
//		try {
//			con = new Conexao();
//			con.leDados();
//			con.fecha();
//		} catch (IllegalStateException e) {
//			System.out.println("Deu erro na conexao!");
//		} finally {
//			con.fecha();
//		}
	}

}
