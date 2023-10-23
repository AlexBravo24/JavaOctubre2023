package com.arrays;

public class Arrays4_RVV {

	public static void main(String[] args) {
		int[] Original = {1, 2, 3, 4, 5};
        int[] Invertido = new int[Original.length];

        for (int i = 0; i < Original.length; i++) {
            Invertido[i] = Original[Original.length - 1 - i];
        }

        System.out.print("original: ");
        for (int num : Original) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("invertido: ");
        for (int num : Invertido) {
            System.out.print(num + " ");
        }
	}

}
