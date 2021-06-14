package br.com.alura.exception.modelo;

public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
        	metodo1();
        }catch(ArithmeticException | NullPointerException | MinhaException | MinhaExceptions ex) {
        	System.out.println("Exeption " + ex.getMessage());
        	ex.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() throws MinhaExceptions{
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MinhaExceptions{
        System.out.println("Ini do metodo2");
        
//        ArithmeticException ex = new ArithmeticException("erro ArithmeticExceptions");
//        throw ex;
        throw new MinhaExceptions("erro Minha execao com thrws na assinatura ou try-catch");
//        throw new MinhaException("erro Minha execao");
        
//        System.out.println("Fim do metodo2");        
    }
}