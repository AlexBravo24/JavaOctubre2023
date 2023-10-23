package comarrays;

public class Array5_MASE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // Crear un array de productos
        String[] productos = {"Zapatos", "Blusa", "Vestido", "Sueter", "Chamarra"};

        // Crear un array de precios
        double[] precios = {10.99, 20.49, 5.99, 15.75, 8.50};

        // Mostrar la lista de productos y sus precios
        System.out.println("Lista de Productos y Precios:");
        for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i] + ": $" + precios[i]);
        }

	}

}
