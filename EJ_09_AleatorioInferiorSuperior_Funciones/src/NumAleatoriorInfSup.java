import java.util.Scanner;

public class NumAleatoriorInfSup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el límite inferior: ");
        int limiteInferior = sc.nextInt();
        System.out.println("Introduce el límite superior: ");
        int limiteSuperior = sc.nextInt();

        int aleatorio = generarNumeroAleatorio(limiteInferior, limiteSuperior);
        System.out.println("El número aleatorio generado es: " + aleatorio);

        sc.close();
    }

    public static int generarNumeroAleatorio(int limiteInferior, int limiteSuperior) {
        return (int) (Math.random() * (limiteSuperior - limiteInferior + 1) + limiteInferior);
    }
}
