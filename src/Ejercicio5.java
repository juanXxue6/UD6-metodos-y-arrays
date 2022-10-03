import java.util.Scanner;

public class Ejercicio5 {

	static public Scanner sc = new Scanner(System.in);
	
	
	public static String BinaryConversor(int numero) {
		int nuevoNumero = numero;
		int valor;
		String resultado = "";
		
		while(nuevoNumero > 0) {
			valor = nuevoNumero % 2;
			resultado = valor + resultado;
			nuevoNumero = nuevoNumero/2;
		}
			
		return resultado.trim();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		
		System.out.println("Introduce un numero");
		numero = sc.nextInt();
		
		System.out.println("Resultado en binario: " + BinaryConversor(numero));
		
	}

}
