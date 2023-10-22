package comarrays;

import java.util.Scanner;

public class Arrays3_MASE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = scanner.nextLine(); // Lee la frase introducida por el usuario

        // Convierte la cadena de caracteres en un array de caracteres
        char[] caracteres = frase.toCharArray();

        // Imprime el array de caracteres
        System.out.print("Los caracteres en el array son: ");
        for (char c : caracteres) {
            System.out.print(c + " ");
        }

        // Cierra el objeto Scanner
        scanner.close();

	}

}
