package reto;
import java.util.Locale;
import java.util.Scanner;
public class reto1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		int eleccion = 1;
		
		do {
		System.out.println("Elije una operacion: \n"
				+ "1. Sumar \n"
				+ "2. Restar \n"
				+ "3. Multiplicar \n"
				+ "4. Dividir \n"
				+ "5. Par \n"
				+ "6. Impar \n"
				+ "7. Positivo \n"
				+ "8. Negativo \n"
				+ "9. Maximo \n"
				+ "10. Minimo \n"
				+ "0. Salir \n");
		System.out.print("Tu eleccion UWU: ");
		
		eleccion = Integer.parseInt(sc.nextLine());
		
		switch (eleccion) {
		case 1:
			System.out.println(Funciones2.sumar(2, 3));
			break;
		case 2:
			System.out.println(Funciones2.restar(60, 120));
			break;
		case 3:
			System.out.println(Funciones3.multiplicar(0, 67676767));
			break;
		case 4:
			System.out.println(Funciones3.division(50, 3));
			break;
		case 5:
			System.out.println(Funciones2.esPar(6));
			break;
		case 6:
			System.out.println(Funciones2.esImpar(7));
			break;
		case 7:
			System.out.println(Funciones3.esPositivo(-67));
			break;
		case 8:
			System.out.println(Funciones3.esNegativo(89));
			break;
		case 9:
			System.out.println(Funciones1.maximo3(4, 9, 300));
			break;
		case 10:
			System.out.println(Funciones1.minimo3(7, 9, -20));
			break;
		}
		System.out.println("");
		}while(eleccion != 0);
		
sc.close();
	}
}
