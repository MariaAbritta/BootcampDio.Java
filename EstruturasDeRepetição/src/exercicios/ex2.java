package exercicios;

//Nota
/*
Programa que pede uma nota, entre zero e dez.
Mostra uma mensagem caso o valor seja inválido
e continua pedindo
até que o usuário informe um valor válido.
*/

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int nota;
		
		System.out.println("Nota: ");
		nota = scan.nextInt();
		
		while(nota < 0 | nota > 10) {
			System.out.println("Nota inválida! Digite entre 1 a 10!");
			System.out.println("Nota: ");
			nota = scan.nextInt();
		}
	}

}
