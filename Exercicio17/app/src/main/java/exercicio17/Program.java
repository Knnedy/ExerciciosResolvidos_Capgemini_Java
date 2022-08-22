package exercicio17;

/**
 * Leia 80 números e ao final informe quantos número(s) est(á)ão no intervalo
 * entre 10 (inclusive) e 150 (inclusive) 
 */

import java.util.Scanner;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)) {

			Locale.setDefault(Locale.US);

			int num = 1, intervalo = 0;

			for(int i = 1; i <= 5; i++) {
				System.out.println("Número: " + i);
				num = sc.nextInt();
				
				if(num >= 10 && num <= 150) {
					intervalo++;
				}
				
			}
			System.out.print("Números no intervalo entre 10 e 150: " + intervalo);

		}
	}
}