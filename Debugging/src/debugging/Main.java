package debugging;

public class Main {

	public static void main(String[] args) {
		System.out.println("Iniciou do programa no m�todo main.");
        a();
        System.out.println("Finalizou do programa no m�todo main.");
    }

    static void a() {
        System.out.println("Entrou no m�todo a.");
        b();
        System.out.println("Finalizou o m�todo a.");
    }

    static void b() {
        System.out.println("Entrou no m�todo b.");
        for(int i = 0; i <= 4; i++) System.out.println(i);
        c();
        System.out.println("Finalizou o m�todo b.");
    }

    static void c(){
        System.out.println("Entrou no m�todo c.");
        //Thread.dumpStack();
        System.out.println("Finalizou o m�todo c.");
    }

}
