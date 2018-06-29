package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	static String[] arch = new String[5];

	// 1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		arch[0] = "Ahri";
		arch[1] = "Syndra";
		arch[2] = "Cecil B. Heimerdinger";
		arch[3] = "Garen";
		arch[4] = "Darius";
		MoreArrayFun nomptrtS = new MoreArrayFun();
		nomptrtS.ptStr(arch);
		nomptrtS.rtStp(arch);
		nomptrtS.pSr(arch);
		// nomptrtS.rptSt(arch);
	}

	// 2. Write a method that takes an array of Strings and prints all the Strings
	// in the array.

	void ptStr(String[] mon) {
		for (String sortable : mon) {
			System.out.println(sortable);
		}
		System.out.println("------------------------------");
	}

	// 3. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in reverse order.
	void rtStp(String[] nom) {
		String[] nova = new String[nom.length];
		for (int i = 0; i < nova.length; i++) {
			nova[i] = nom[nom.length - i - 1];

		}

		for (String sortable : nova) {
			System.out.println(sortable);
		}
		System.out.println("------------------------------");
	}

	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.
	void pSr(String[] mn) {
		String[] filler = new String[mn.length];
		String[] picnikka = new String[(mn.length) - ((int) mn.length / 2)];
		System.out.println(picnikka.length);
		for (int i = 0; i < mn.length - 1; i++) {
			if (i % 2 != 0) {
				filler[i] = mn[i];
			}
		}

		for (int i = 0; i < filler.length; i++) {
			if (filler[i] != null) {
				picnikka[i] = filler[i];
			}
			// make picnikka set its 0, 1, 2 slots to filler's 1, 3, 5 slots
		}

		for (

		String sortable : picnikka) {
			System.out.println(sortable);
		}
		System.out.println("------------------------------");
	}

	// 5. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in a completely random order. Almost every run of the program should result
	// in a different order.
	void rptSt(String[] nmo) {

	}

}
