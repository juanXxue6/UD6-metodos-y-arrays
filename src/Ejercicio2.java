
import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {

	static public Scanner sc = new Scanner(System.in);
	
	
	public static void RandomNumbers(int min, int max, int amount) {
		Random random = new Random();
		
		for (int i = 0; i < amount; i++) {
			System.out.print((random.nextInt(max - min + 1) + min) + " " );
			
		}

	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amount;
		int min;
		int max;
		
		System.out.println("¿Cuantos numeros aleatorios quieres?");
		amount = sc.nextInt();
		
		System.out.println("Rango minimo");
		min = sc.nextInt();
		
		System.out.println("Rango maximo");	
		max = sc.nextInt();
		
		RandomNumbers(min, max, amount);
	}

}
