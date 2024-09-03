package controller;

public class ThreadMatriz extends Thread {
	
	int[][] matriz;
	int linha;
	
	public ThreadMatriz(int[][] matriz, int linha) {
		super();
		this.matriz = matriz;
		this.linha = linha;
	}
	
	@Override
	public void run() {
		int soma = 0;
		for(int x = 0; x < 5; x++) {
			soma = soma + matriz[linha][x];
		}
		System.out.println(soma);
	}
	
}
