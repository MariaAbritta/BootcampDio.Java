package ex1;

public class Main {

	public static void main(String[] args) {
		
		//Calculadora
		System.out.println("---- Exer�cio Calculadora ----");
		Calculadora.soma(3, 6);
		Calculadora.subtracao(9, 1.8);
		Calculadora.multiplicacao(7, 8);
		Calculadora.divisao(5, 2.5);
		System.out.println("----------------------");
		
		//Mensagem
		System.out.println("---- Exer�cio Mensagem ----");
		Mensagem.obterMensagem(9);
		Mensagem.obterMensagem(14);
		Mensagem.obterMensagem(4);
		System.out.println("----------------------");
		
		//Empr�stimo
		System.out.println("---- Exer�cio Empr�stimo ----");
		Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
		Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
		Emprestimo.calcular(1000, 5);
		System.out.println("----------------------");

	}

}
