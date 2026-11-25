import java.util.Scanner;

public class ContarPalabrasConInicialEspecifica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);

		String[] palabras = {"Hola", "Adios", "Buenas", "Ander", "Suelo", "Pared", "Esquina"};
		
		System.out.println("Ingrese una letra: ");
		char inicial = scanner.nextLine().toLowerCase().charAt(0);
		
		int cantidad = contarPalabras(palabras, inicial);
		
		System.out.println("La cantidad de palabras con esa inicial es de: " + cantidad);
		
		scanner.close();
	}
	
	public static int contarPalabras(String[] palabras, char inicial) {
		int contador = 0;
		
		for (int i = 0; i < palabras.length; i++);
			char primeraLetra = palabras[i].toLowerCase().charAt(i);

			if (primeraLetra == inicial) {
				contador++;
			}
	}
	
	return contador;

}
