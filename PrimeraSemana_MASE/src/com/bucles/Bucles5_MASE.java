package com.bucles;

import java.text.DecimalFormat;

public class Bucles5_MASE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DecimalFormat df = new DecimalFormat("00"); // Para formatear números con dos dígitos

        for (int hora = 0; hora < 24; hora++) {
            for (int minuto = 0; minuto < 60; minuto++) {
                for (int segundo = 0; segundo < 60; segundo++) {
                    String horaFormateada = df.format(hora);
                    String minutoFormateado = df.format(minuto);
                    String segundoFormateado = df.format(segundo);

                    System.out.print(horaFormateada + ":" + minutoFormateado + ":" + segundoFormateado + "\r");

                    try {
                        Thread.sleep(1000); // Esperar un segundo (1000 milisegundos)
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
	}

}
