package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {

		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				System.out.print(matrise[i][j] + " ");
			}
			System.out.println();
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		for (int i = 0; i < matrise.length; i++)

		{
			System.out.print("/n");
			for (int j = 0; j < matrise[i].length; j++) {

				System.out.print(+matrise[i][j] + " ");
			}

		}
		return null;

	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[0].length; j++) {
				System.out.format("%d \t", (tall * matrise[i][j]));
			}
			System.out.print("\n");
		}
		return matrise;

	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		int i, j;

		int n = a.length;
		for (i = 0; i < n; i++)
			for (j = 0; j < n; j++)
				if (a[i][j] != b[i][j])
					return false;
		return true;
	}

	// e) (VALGFRI)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");

	}

	// f) (VALGFRI)
	public static int[][] multipliser(int[][] a, int[][] b) {

		int[][] resultat = new int[a.length][b.length];
		int sum = 0;

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length; j++) {

				for (int k = 0; k < b.length; k++)
					sum = sum + a[i][k] * b[k][j];

				resultat[i][j] = sum;
				sum = 0;

				System.out.print(resultat[i] + " ");
			}
		}
		return resultat;

	}
}
