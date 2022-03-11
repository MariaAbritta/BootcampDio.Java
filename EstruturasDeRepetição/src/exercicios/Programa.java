package exercicios;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        

        double A, B, media;
        
        System.out.printf("Digite a nota 1: ");
        A = sc.nextDouble();
        System.out.printf("Digite a nota 2: ");
        B = sc.nextDouble();

        //TODO: Complete os espa�os em branco com as respectivas vari�veis para o c�lculo da m�dia.
        media = ((A * 3.5) + (B * 7.5))/11; 
        sc.close();
        DecimalFormat df = new DecimalFormat("#.00000");
        //String newmedia = Double.toString(media);
        //newmedia.replaceAll(",",".");
        //TODO: Complete com a vari�vel que representa o resultado da m�dia.
        //System.out.printf("%.5f", media);
        System.out.println(df.format(media));
    }
}
