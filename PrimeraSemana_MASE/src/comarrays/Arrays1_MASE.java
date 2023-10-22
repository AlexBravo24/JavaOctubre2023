package comarrays;

import java.util.Scanner;

public class Arrays1_MASE {

	public static void main(String[] args) {
		
		// Crea un array de 10 posiciones de números con valores pedidos por teclado.
	// Muestra por consola el índice y el valor al que corresponde
	
		Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce un número para la posición " + i + ": ");
            numeros[i] = scanner.nextDouble();
        }

        System.out.println("Índice\tValor");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(i + "\t" + numeros[i]);
        }
	
	
	}
	
	

}
