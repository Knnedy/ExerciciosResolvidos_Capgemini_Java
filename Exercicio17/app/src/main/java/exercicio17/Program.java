package exercicio17;

/**
 * Leia 80 números e ao final informe quantos número(s) est(á)ão no intervalo
 * entre 10 (inclusive) e 150 (inclusive) 
 */

import java.util.Scanner;
import java.util.Locale;
import java.util.Random;

public class Program {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)) {

			Random rand = new Random();

			Locale.setDefault(Locale.US);

			int num, intervalo = 0;

			for(int i = 0; i <= 80; i++) {
				num = rand.nextInt(1000);
				System.out.println("Número: " + num);
				
				if(num >= 10 && num <= 150) {
					intervalo++;
				}
			}
			System.out.print("Números no intervalo entre 10 e 150: " + intervalo);

		}
	}
}