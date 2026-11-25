import java.util.Scanner;

public class HacerSuma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca el primer número:");
		int num1 = sc.nextInt();

		System.out.println("Introduzca el segundo número:");
		int num2 = sc.nextInt();

		int suma = sumarDosNumeros(num1, num2);
		System.out.println("La suma es: " + suma);

		sc.close();
	}

	public static int sumarDosNumeros(int num1, int num2) {
		return num1 + num2;
	}
}