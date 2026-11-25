import java.util.Scanner;

public class CalcularFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int numero = sc.nextInt();

        int factorial = calcularFactorial(numero);
        System.out.println("El factorial de " + numero + " es: " + factorial);

        sc.close();
    }

    public static int calcularFactorial(int numero) {
        int resultado = 1;

        for (int i = 1; i <= numero; i++) {
            resultado = resultado * i;
        }
        return resultado;
    }
}
