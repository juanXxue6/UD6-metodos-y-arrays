import java.util.Random;
import java.util.Scanner;

public class Ejercicio9 {

public static Scanner sc = new Scanner(System.in);
	
	public static int[] RandomArray(int longitud) {
		int[] array = new int[longitud];
		Random random = new Random();
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (random.nextInt(9 - 0 + 1));
		}
		
		return array;
	}
	
	
	public static void EnseñarArray(int[] array) {
		int suma = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.println("Valor " + (i+1) + " de la array: " + array[i]);
			suma = suma + array[i];
		}
		System.out.println("Suma total de los valores: " +  suma);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array;
		int longitudArray = 0;
		
		try {
			System.out.println("Introduce la logitud del array");
			longitudArray = sc.nextInt();	
		}catch (Exception e) {
			// TODO: handle exception
			System.err.println("Introduzca un valor valido");
		}
		
		array = RandomArray(longitudArray);
		EnseñarArray(array);
		
	}
	
}
