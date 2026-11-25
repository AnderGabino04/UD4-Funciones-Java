import java.util.Scanner;

public class MayorDeTres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);

	        System.out.println("Introduce el primer numero: ");
	        int num1 = sc.nextInt();
	        System.out.println("Introduce el segundo numero: ");
	        int num2 = sc.nextInt();
	        System.out.println("Introduce el tercer numero: ");
	        int num3 = sc.nextInt();

	        int mayor = encontrarMayor(num1, num2, num3);
	        System.out.println("El número mayor es: " + mayor);

	        sc.close();
	    }

	    public static int encontrarMayor(int num1, int num2, int num3) {
	        if (num1 >= num2 && num1 >= num3) {
	            return num1;
	        } else if (num2 >= num3) {
	            return num2;
	        } else {
	            return num3;
	        }
	    }
}
