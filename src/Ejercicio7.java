import java.util.Scanner;

public class Ejercicio7 {
	
	static public Scanner sc = new Scanner(System.in);
	
	
	public static void MoneyConversor(double money, String newCurrency) {
		
		switch (newCurrency.toLowerCase()) {
		
		case "dolar":
		case "dolares":
			System.out.println((money*1.28611) + " Dolares");
			
			
			break;
			
		case "libra":
		case "libras":
			
			System.out.println((money*0.86) + " Libras");
			
			break;
			
		case "Yen":
		case "yenes":

			System.out.println((money*129.852) + " yenes");
			
			break;

		default:
			System.err.println("Moneda no reconocida");
			break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double cantidadMoneda = 0;
		String currency;
		
		try {
		System.out.println("Cantidad de euros a cambiar ");
		cantidadMoneda = sc.nextDouble();
		}catch (Exception e) {
			System.err.println("Introduzca un valor valido");
		}
		System.out.println("Moneda a transformar(libras, yenes o dolares)");
		currency = sc.next();
		
		MoneyConversor(cantidadMoneda, currency);
		
	}

}
