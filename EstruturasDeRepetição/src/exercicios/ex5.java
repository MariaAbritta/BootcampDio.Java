package exercicios;

import java.util.Scanner;

//Tabuada
/*
Gerador de tabuada,
capaz de gerar a tabuada de qualquer n�mero inteiro entre 1 a 10.
O usu�rio deve informar de qual numero ele deseja ver a tabuada.
*/

public class ex5 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);

	        System.out.println("Tabuada: ");
	        int tabuada = scan.nextInt();

	        System.out.println("Tabuada de " + tabuada);
	        for(int i = 1; i <= 10; i = i++) {
	            System.out.println(tabuada + " X " + i + " = " + (tabuada*i));
	        }
	}

}
