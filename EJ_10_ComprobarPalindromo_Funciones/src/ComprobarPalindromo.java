import java.util.Scanner;

public class ComprobarPalindromo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una palabra: ");
        String palabra = sc.nextLine();

        if (esPalindromo(palabra)) {
            System.out.println("La palabra es un palíndromo.");
        } else {
            System.out.println("La palabra no es un palíndromo.");
        }

        sc.close();
    }

    public static boolean esPalindromo(String palabra) {
        palabra = palabra.toLowerCase();
        String invertida = "";

        for (int i = palabra.length() - 1; i >= 0; i--) {
            invertida += palabra.charAt(i);
        }
        return palabra.equals(invertida);
    }
}
