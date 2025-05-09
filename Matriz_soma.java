package Projetos_LPA.aula14;

public class Matriz_soma {

	public static void main(String[] args) {
		int[][] num = new int[5][5];
		int soma = 0;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				num[i][j] = (int) Math.round(Math.random() * 50);
				soma = soma + num[i][j];
			}
		}

		System.out.println("Matriz gerada:\n");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%-4d", num[i][j]);
			}
			System.out.println(" ");
		}
		
		System.out.println("\nSoma da matriz: " + soma);
	}

}
