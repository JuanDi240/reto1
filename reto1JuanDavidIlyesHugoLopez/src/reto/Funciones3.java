package reto;

public class Funciones3 {
	public static int multiplicar(int a, int b) {
		int resultado = a*b;
		return resultado;
	}
	public static int division(int a, int b) {
		if (a == 0 || b == 0) {
			return 0;
		}else {
			return a/b;
		}
	}
	public static boolean esPositivo(int n) {
		if (n >= 0) {
			return true;
		}else {
			return false;
		}
	}
	public static boolean esNegativo(int n) {
		if (n <= 0) {
			return true;
		}else {
			return false;
		}
	}
}
