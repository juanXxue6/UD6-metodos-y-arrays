import java.util.Scanner;

public class Ejercicio6 {
	
	static public Scanner sc = new Scanner(System.in);
	
	static public void CharsNumber(int number) {
		
		String lenght = Integer.toString(number);
		
		System.out.println("Numero de cifras: " + lenght.length());
		
	}
	
	public static void main(String[] args) {
		
		int number = 0;
		do {
		try {
		System.out.println("Introduzca un numero entero positivo");
		number = sc.nextInt();
		
		if(number > 0)
			CharsNumber(number);
		else 
			System.out.println("Introduce un numero positivo");
			
		
		}catch (Exception e) {
			// TODO: handle exception
			System.err.println("Introduce un valor valido");
			}
		}while(number < 0);
		
		sc.close();
	}
	
}