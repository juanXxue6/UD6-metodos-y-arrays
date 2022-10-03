import java.util.Scanner;

public class Ejercicio3 {

	
	static public Scanner sc = new Scanner(System.in);
	
	
	
	public static boolean NumeroPrimo(int numero) {
		for(int i = 2; i < numero;i++) {
			if( numero % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		boolean esPrimo;
		
		try{
			
		System.out.println("Introduce un numero para comprobar si es primo");
		numero = sc.nextInt();
		esPrimo = NumeroPrimo(numero);
		
		if(esPrimo)
			System.out.println("Es primo");
		else{
			System.out.println("No es prmo");
		}
		
		}catch (Exception e) {
			// TODO: handle exception
			System.err.println("Introduce un dato valido");
		}
		
	}

}
