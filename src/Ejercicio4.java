import java.util.Scanner;

public class Ejercicio4 {
	static public Scanner sc = new Scanner(System.in);
	
	
	public static void Factorial(int factorial) {
		int total = factorial;
		
		for (int i = factorial - 1; i > 0; i--) {
			total = i * total;			
		}
		System.out.println("El factorial es " + total);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			
			System.out.println("Introduce un numero ");
			int numero = sc.nextInt();
			
			Factorial(numero);
			
			}catch (Exception e) {
				// TODO: handle exception
				System.err.println("Introduce un dato valido");
			}
	}

}
