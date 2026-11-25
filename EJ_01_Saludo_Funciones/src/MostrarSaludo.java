
public class MostrarSaludo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Aqui vamos a poner el codigo
		
		String mensaje = "¡Hola!";
		//Asi llamamos a una función con parametros --> String en la propia llamada
		
		mostrarMensaje("¡Hola!");
		//Asi llamamos a una función con parametros --> utilizando una variable
		
		mostrarMensaje(mensaje);
	}

	//VOID significa que la función no devolverá nada, no tiene datos de salida
	private static void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);
	}

}
