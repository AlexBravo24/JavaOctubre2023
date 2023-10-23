package comarrays;

public class Arrays4_MASE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Crear el primer array
        int[] arrayOriginal = {1, 2, 3, 4, 5};
        
        // Crear un segundo array para almacenar los valores invertidos
        int[] arrayInvertido = new int[arrayOriginal.length];
        
        // Copiar los valores en orden inverso
        for (int i = 0; i < arrayOriginal.length; i++) {
            arrayInvertido[i] = arrayOriginal[arrayOriginal.length - 1 - i];
        }
        
        // Imprimir el segundo array con los valores invertidos
        for (int valor : arrayInvertido) {
            System.out.print(valor + " ");
        }
	}

}
