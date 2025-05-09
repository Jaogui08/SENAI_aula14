package Projetos_LPA.aula14;

public class Matriz_exemplo {

	public static void main(String[] args) {
		int[][] m = new int[3][3];
		
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				m[i][j] = (int)Math.round(Math.random()*20);
			}
		}
		System.out.println("Matriz gerada:\n");
		
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				System.out.printf("%-4d", m[i][j]);
			}
			System.out.println(" ");
		}

	}

}
