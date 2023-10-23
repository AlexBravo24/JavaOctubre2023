package com.ciclos;

public class Ciclos5_MPHC {

	public static void main(String[] args) {
        for (int h= 0; h < 24; h++) {
            for (int m = 0; m < 60; m++) {
                for (int segundo = 0; segundo < 60; segundo++) {
                    // Formatear la hora, el m y el segundo como cadenas de dos dígitos
                    String horaStr = String.format("%02d", h);
                    String mStr = String.format("%02d", m);
                    String segundoStr = String.format("%02d", segundo);

                    // Imprimir la hora actual
                    System.out.println(horaStr + ":" + mStr + ":" + segundoStr);

                    // Pausa de 1 segundo para simular el tiempo real (opcional)
                    try {
                        Thread.sleep(1000); // 1000 milisegundos = 1 segundo
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

	}

}
