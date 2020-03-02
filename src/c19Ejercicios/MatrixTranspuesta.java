package c19Ejercicios;

public class MatrixTranspuesta {

	public static void main(String[] args) {
		int matrixA [][] = new int[5][9];
		int matrixB [][] = new int[9][5];
		
		for (int i=0; i<matrixA.length; i++) {
			for (int j=0; j<matrixA[i].length; j++) {
			matrixA [i][j] = (int)(Math.random()*10+1);
			System.out.print(matrixA[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println("\nMatriz Transpuesta: \n");
		for (int i=0; i<matrixB.length; i++) {
			for (int j=0; j<matrixB[i].length; j++) {
				matrixB[i][j] = matrixA[j][i];
				
				System.out.print(matrixB[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
