package Exercicio;

public class Main {

	public static void main(String[] args) {
		
		// Retornos
        System.out.println("Exerc�cio retornos");

        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("�rea do quadrado:" + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5,5);
        System.out.println("�rea do ret�ngulo:" + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(7,8,9);
        System.out.println("�rea do trap�zio:" + areaTrapezio);
        
	}

}
