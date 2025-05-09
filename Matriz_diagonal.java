package Projetos_LPA.aula14;

public class Matriz_diagonal {

	public static void main(String[] args) {
		int[][] num = new int[4][4];

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (i == j) {
					num[i][j] = (int) Math.round(Math.random() * 100);
				}
			}
		}

		System.out.println("Matriz obtida:\n");

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				//System.out.print(num[i][j] + "   ");
				System.out.print((i == j ? num[i][j] : "   ") + "   ");
			}
			System.out.println(" ");
		}
	}

}
