package exercicios;

//Maior e media
/*
Programa que le 5 n�meros
e informa o maior n�mero
e a m�dia desses n�meros.
*/

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;

        int count = 0;
        do {
            System.out.println("N�mero: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if (numero > maior) maior = numero;

            count = count + 1;
        } while(count < 5);

        System.out.println("Maior: " + maior);
        System.out.println("M�dia: " + (soma/5));
	}

}
