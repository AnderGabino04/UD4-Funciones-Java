import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Introduce el primer numero entero:");
		int num1 = scanner.nextInt();
		
		System.out.println("Introduce el segundo numero entero:");
		int num2 = scanner.nextInt();
		
		System.out.println("Introduce la operacion (\"+ | - | * | / | Salir\")");
		String operacion = scanner.next();
		
		double total = calcular(num1, num2, operacion);
		System.out.println("El resultado es: " + total);
		
		scanner.close();
		
	}
	
	public static double calcular(int num1, int num2, String operacion) {
		double resultado = 0;
		
		switch (operacion) {
		case "+":
			System.out.println("Ha elegido suma");
			resultado = num1 + num2;
			break;
			
		case "-":
			System.out.println("Ha elegido resta");
			resultado = num1 - num2;
			break;
			
		case "*":
			System.out.println("Ha elegido multiplicacion");
			resultado = num1 * num2;
			break;
		
		case "/":
			if (num2 != 0) {
				System.out.println("Ha elegido division");
				resultado = (double) num1 / num2;
			} else {
				System.out.println("No puedes dividir un valor entre 0");
			}
			break;
			
		case "Salir":
			System.out.println("¡Hasta pronto!");
			break;
			
		default:
			System.out.println("Operacion incorrecta");
			break;
		}
		
		return resultado;
	}
}
