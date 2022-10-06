import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio12 {

	static public Scanner sc = new Scanner(System.in);
	
	
	public static int[] RandomArray(int longitud) {
		int[] array = new int[longitud];
		int numberToAdd = 0;
		boolean canAdd = false;
		Random random = new Random();
		
		for (int i = 0; i < array.length; i++) {
			
				numberToAdd = ((random.nextInt(300 - 1 + 1) + 1));
				
			array[i] = numberToAdd;
		}
		
		return array;
	}
	
	public static int ArrayNumerosindicado(int array[]) {
		
		int numero = -3;
		do {
			try {
				System.out.println("Introduce un precio entre 0 y 9");
				numero =  Integer.parseInt(sc.nextLine());
			
			if(numero < -1 || numero > 10) {
				System.err.println("Introduce un precio entre 0 y 9");
			}
			}catch (Exception e) {
				System.err.println("Introduce un valor valido");
			}
		}while(numero < -1 || numero > 10);

		return numero;
	}
	
	
	public static ArrayList<Integer> Lista(int[] array, int valorBuscar) {
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		int numeroDividir = 0;
		
		for (int i = 0; i < array.length; i++) {
			numeroDividir = array[i] % 10;
			
			if(numeroDividir == valorBuscar) {
				numeros.add(array[i]);
			}
		}
		
		return numeros;
	}
	
	public static void EnseñarLista(ArrayList<Integer> numerosFinales) {
		
		if(numerosFinales.size() == 0) {
			System.out.println("No hay numeros acabados en el numero indicado");
		}else {
			for (int i = 0; i < numerosFinales.size(); i++) {
				System.out.print(numerosFinales.get(i) + " ");
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int longitud;
		int valorBuscar;
		int arrayRandom[];
		ArrayList<Integer> numerosFinales; 
		
		System.out.println("Longitud array");
		longitud = Integer.parseInt(sc.nextLine());
		
		arrayRandom = RandomArray(longitud);
		valorBuscar = ArrayNumerosindicado(arrayRandom);
		numerosFinales = Lista(arrayRandom, valorBuscar);
		EnseñarLista(numerosFinales);
		
		System.out.println();
		for (int i = 0; i < arrayRandom.length; i++) {
			System.out.print(arrayRandom[i]  + " ");
		}
		
	}

}
