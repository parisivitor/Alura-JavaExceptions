package br.com.alura.exception.modelo;
/**
 * Classe que representa um cliente no bytebank
 * 
 * @author vitor parisi
 * @version 1.0
 */
public class Conta {
	
	/**
	 * Construtor para inicializar o objeto Conta a partir da agencia e do numero
	 * 
	 * @param agencia
	 * @param numero
	 */
	public Conta(int agencia, int numero) {
		if(agencia <1 )
			throw new IllegalArgumentException("Agencia invalida");
		if(numero < 1)
			throw new IllegalArgumentException("Numero invalido");
	}	
	
	/**
	 * Construtor default do metodo deposita, sem paramentos, sem retorno, vazio.
	 * @param notparam
	 */
	public void deposita() {}

}
