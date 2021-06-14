package br.com.alura.exception.modelo;

public class Conexao implements AutoCloseable{

    public Conexao() {
        System.out.println("Abrindo conexao");
    }

    public void leDados() {
        System.out.println("Recebendo dados");
        throw new IllegalStateException();
    }


//    public void fecha() {
//        System.out.println("Fechando conexao");
//    }
    
//	reutiliza um metodo de tratamento com o implements AutoCloseable
	@Override
	public void close() {
		System.out.println("Fechando conexao");		
	}
}