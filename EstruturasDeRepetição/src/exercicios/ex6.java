package exercicios;

import java.util.Scanner;

//Fatorial
/*
Programa calcula o fatorial de um número inteiro fornecido pelo usuário.
*/

public class ex6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();

        int multiplicacao = 1;

        System.out.print(fatorial +"! = ");
        for(int i = fatorial ; i >= 1 ; i --) {
            multiplicacao = multiplicacao * i;
        }

        System.out.println(multiplicacao);
	}

}
