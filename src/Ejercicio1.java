import java.util.Scanner;

public class Ejercicio1 {

	static public Scanner sc = new Scanner(System.in);
	
	
	public static double circulo(double radio) {
		
		return Math.PI*Math.pow(radio, 2);
	}
	
	public static double cuadrado(double lado) {
		
		return lado*lado;
	}
	
	public static double triangulo(double base, double altura) {
		
		return ((base * altura)/2);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String figura;
		double operador;
		try {
			
		System.out.println("Introduzca que figura desea calcular el area (circulo, cuadrado o triangulo)");
		figura = sc.nextLine();
		
		switch (figura.toLowerCase().trim()) {
		case "circulo":
			
			System.out.println("Introduzca el radio");	
			operador = sc.nextDouble();
			System.out.println(circulo(operador));	
			break;

		case "cuadrado":
			
			System.out.println("Introduzca el valor del costado");	
			operador = sc.nextDouble();
			System.out.println(cuadrado(operador));	
			break;	
			
		case "triangulo":
			
			System.out.println("Introduzca la base");	
			operador = sc.nextDouble();
			System.out.println("Introduzca la altura");	
			double operadorAux = sc.nextDouble();
			System.out.println(triangulo(operador, operadorAux));	
			break;	
			
			
		default:
			System.err.println("Introduzca un valor valido");
			break;
		}
		
		
		
		}catch (Exception e) {
			// TODO: handle exception
			System.err.println("Introduzca un valor valido");
		}
	
		sc.close();
	}

}
