package comarrays;

public class Arrays2_MASE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numeros = new int[100];

        // Llenar el array con los números del 1 al 100
        for (int i = 0; i < 100; i++) {
            numeros[i] = i + 1;
        }

        // Calcular la suma de todos los números
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }

        // Calcular la media
        double media = (double) suma / numeros.length;

        // Imprimir la suma y la media
        System.out.println("Suma de los números: " + suma);
        System.out.println("Media de los números: " + media);
    }

}
