package exercicios;

//Nota
/*
Programa que pede uma nota, entre zero e dez.
Mostra uma mensagem caso o valor seja inv�lido
e continua pedindo
at� que o usu�rio informe um valor v�lido.
*/

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int nota;
		
		System.out.println("Nota: ");
		nota = scan.nextInt();
		
		while(nota < 0 | nota > 10) {
			System.out.println("Nota inv�lida! Digite entre 1 a 10!");
			System.out.println("Nota: ");
			nota = scan.nextInt();
		}
	}

}
