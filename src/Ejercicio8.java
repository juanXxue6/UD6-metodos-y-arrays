import java.util.Scanner;

public class Ejercicio8 {
	
	
	
public static Scanner sc = new Scanner(System.in);
	
	public static int[] LlenarArray() {
		int[] array = new int[10];
		
		for (int i = 0; i < array.length; i++) {
			try {
				System.out.println("Introduce el valor " + (i+1) + " de la array");
				array[i] = sc.nextInt();
				
			}catch (Exception e) {
				// TODO: handle exception
				System.err.println("Introduzca un valor valido");
			}
		}
		
		return array;
	}
	
	
	public static void EnseñarArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("Valor " + (i+1) + " de la array: " + array[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[10];
		
		array = LlenarArray();
		EnseñarArray(array);
		
	}

}
