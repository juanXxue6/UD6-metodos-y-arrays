import java.util.Random;
import java.util.Scanner;

public class Ejercicio10 {

	
	static public Scanner sc = new Scanner(System.in);
	
	
	public static boolean EsPrimo(int numero) {
		for(int i = 2; i < numero;i++) {
			if( numero % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static int[] RandomArray(int longitud , int maxRandom, int minRandom) {
		int[] array = new int[longitud];
		int numberToAdd = 0;
		boolean canAdd = false;
		Random random = new Random();
		
		for (int i = 0; i < array.length; i++) {
			
			do {
				numberToAdd = ((random.nextInt(maxRandom - minRandom + 1) + minRandom));
				canAdd = EsPrimo(numberToAdd);
			}while(!canAdd);
				
			array[i] = numberToAdd;
		}
		
		return array;
	}
	
	public static void EnseñarArray(int[] array) {
		int maxValue = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.println("Valor " + (i+1) + " de la array: " + array[i]);
				
			if(maxValue < array[i])
				maxValue = array[i];

		}
		
		System.out.println("Numero mas grande: " + maxValue);
	}
	
	
	public static void main(String[] args) {

		int min;
		int max;
		int longitud;
		int[] array;
		
		System.out.println("Longitud array");
		longitud = sc.nextInt();
		
		System.out.println("Rango minimo");
		min = sc.nextInt();
		
		System.out.println("Rango maximo");	
		max = sc.nextInt();
		
		array = RandomArray(longitud, max, min);
		EnseñarArray(array);
		
	}

}
