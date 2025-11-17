package reto;

public class Funciones1 {

public static int maximo3(int n1, int n2, int n3) {
	int numeroMaximo = Math.max(n1, n2);
	numeroMaximo = Math.max(numeroMaximo, n3);
	return numeroMaximo;
}
	
public static int minimo3(int n1, int n2, int n3) {
	int numeroMinimo = Math.min(n1, n2);
	numeroMinimo = Math.min(numeroMinimo, n3);
	return numeroMinimo;
}	
	
	
}
