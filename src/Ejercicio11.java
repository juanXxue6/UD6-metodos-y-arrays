import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio11 {
	static public Scanner sc = new Scanner(System.in);
	
	
	public static int[] RandomArray(int longitud , int maxRandom, int minRandom) {
		int[] array = new int[longitud];
		int numberToAdd = 0;
		boolean canAdd = false;
		Random random = new Random();
		
		for (int i = 0; i < array.length; i++) {
			
				numberToAdd = ((random.nextInt(maxRandom - minRandom + 1) + minRandom));
				
			array[i] = numberToAdd;
		}
		
		return array;
	}
	
	
	public static void multplciarArrays (int[] array1, int[] array2) {
		
		for (int i = 0; i < array2.length; i++) {
			System.out.println("Multiplicacion posicion " + (i+1) + " : " + (array1[i]*array2[i]) + " ");
		}
			
	}
	
	
	public static void enseñarArrays (int[] array1, int[] array2) {
		
		 for (int i = 0; i < array2.length; i++) {
			System.out.print(" " + array1[i]);
		}
		 System.out.println();
		 for (int i = 0; i < array2.length; i++) {
			System.out.print(" " + array2[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array1;
		int[] array2;
		int min;
		int max;
		int longitud;
		
		System.out.println("Longitud array");
		longitud = sc.nextInt();
		
		array1 = new int[longitud];

		System.out.println("Rango minimo");
		min = sc.nextInt();
		
		System.out.println("Rango maximo");	
		max = sc.nextInt();
		
		array1 = RandomArray(longitud, max, min);
		
		array2 = Arrays.copyOf(array1, longitud);
		
		array2 = RandomArray(longitud, max, min);
		
		multplciarArrays(array1, array2);
		
		enseñarArrays(array1, array2);
		
		
		
	}

}
