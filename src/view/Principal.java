package view;

import java.util.Random;

import controller.ThreadMatriz;

public class Principal {
	public static void main(String[] args) {
		int[][] matriz = new int[3][5];
		Random gerador = new Random();
		
		for(int x = 0; x < 3; x++) {
			for(int y = 0; y < 5; y++) {
				matriz[x][y] = gerador.nextInt(100);
			}
		}
		
		for(int x = 0; x < 3; x++) {
			for(int y = 0; y < 5; y++) {
				System.out.print(matriz[x][y]+" ");
			}
			System.out.print("\n");
		}
		
		for(int x = 0; x < 3; x++) {
			ThreadMatriz t = new ThreadMatriz(matriz, x);
			t.start();
		}
		
	}
}
