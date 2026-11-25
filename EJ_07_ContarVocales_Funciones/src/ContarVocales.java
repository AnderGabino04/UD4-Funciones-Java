import java.util.Scanner;

public class ContarVocales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una palabra: ");
        String palabra = sc.nextLine();

        int cantidad = contarVocales(palabra);
        System.out.println("La cantidad de vocales es: " + cantidad);

        sc.close();
    }

    public static int contarVocales(String palabra) {
        int contador = 0;

        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.toLowerCase().charAt(i);

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador++;
            }
        }
        return contador;
    }
}
