package paqueteZulit.Ejercicios.Matrices;

import paqueteZulit.Ejercicios.Utils;

public class InicializaMatriz {

	public static void main(String[] args) {
		int matriz[][] = new int[5][5];
		
		inicializarMatriz(matriz);
		
		mostrarMatriz(matriz);
	}
	
	public static void inicializarMatriz (int matriz[][]) {
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = 0; 
			}
		}	
	}

	public static void mostrarMatriz (int matriz[][]) {
			
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz.length; j++) {
					System.out.print(matriz[i][j] + '\t');
				}
				System.out.println();
			}	
		}
}
