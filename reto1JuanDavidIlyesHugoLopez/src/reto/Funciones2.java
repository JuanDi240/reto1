package reto;

public class Funciones2 {
	public static int sumar(int numeroa, int numerob){
		int suma=numeroa+numerob;
		return suma;
	}
	
	public static int restar(int numeroc, int numerod){
		int resta=numeroc-numerod;
		return resta;
	}
	public static boolean esPar(int numeroe) {
		if(numeroe%2==0) {
			return true;
		}
		else return false;
	}
	public static boolean esImpar(int numerof) {
		if(numerof%2!=0) {
			return true;
		}
		else return false;
	}
}
