package no.hvl.dat100.lab5.tabeller;

import java.util.Arrays;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		for (int i = 0; i < tabell.length; i++) {

			System.out.println(tabell[i] + " ");
		}

	}

	// b)
	public static String tilStreng(int[] tabell) {

		System.out.println(Arrays.toString(tabell));
		return null;
	}

	// c)
	public static int summer(int[] tabell) {

		int sum = 0;
		for (int i = 0; i < tabell.length; i++) {
			sum += tabell[i];
		}

		System.out.println(sum);
		return sum;

	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		for (int n : tabell) {
			if (tall == n) {
				return true;
			}
		}
		return false;

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		int t = -1;

		if (tall == tabell[0]) {
			System.out.print(tall);
		} else {
			System.out.print(t);
		}
		return t;

	}

	// f)
	public static int[] reverser(int[] tabell) {

		int temp;
		int start = 0;
		int slutt = tabell.length - 1;

		while (start < slutt) {
			temp = tabell[start];
			tabell[start] = tabell[slutt];

			tabell[slutt] = temp;

			start++;
			slutt--;
		}

		for (int i = 0; i < tabell.length; i++)
			i++;
		{
			System.out.println(Arrays.toString(tabell));
		}
		return tabell;

	}

	// g)
	public static boolean erSortert(int[] tabell) {

		int j = 0;
		boolean sortert = true;

		while (sortert && j < tabell.length - 1) {
			if (tabell[j] > tabell[j + 1]) {
				sortert = false;
			}

			j++;
		}
		return sortert;

	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int lengde1 = tabell1.length;
		int lengde2 = tabell2.length;
		int[] tabell3 = new int[lengde1 + lengde2];
		System.arraycopy(tabell1, 0, tabell3, 0, lengde1);
		System.arraycopy(tabell2, 0, tabell3, lengde1, lengde2);
		{
			System.out.println(Arrays.toString(tabell3));

		}

		return tabell3;
	}
}
