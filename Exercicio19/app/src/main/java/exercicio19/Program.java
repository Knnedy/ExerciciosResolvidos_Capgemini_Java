package exercicio19;

/**
 * Escreva um algoritmo que leia o nome e o sexo de 56 pessoas e informe o nome
 * e se ela é homem ou mulher. No final informe total de homens e de mulheres.
 */

import java.util.Scanner;
import java.util.Random;

public class Program {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)) {
			
			// randomizando String
			Random rand = new Random();

			String alpha = "abcdefghijklmnopqrstuvwxyz";
			StringBuilder sb = new StringBuilder();

			// randomizando Char
			String sexo = "fm";
			int lenghtString = 4;
			int randInt;
			char randomSex = 0;
			int index;

			// contador
			int contador = 0;
			while(contador < 4){
			
				contador++;

				for(int i = 0; i < lenghtString; i++) {
					
					// randomizando o nome
					index = rand.nextInt(alpha.length());
					sb.append(alpha.charAt(index));
					
					// randomizando o sexo
					randInt = rand.nextInt(sexo.length());
					randomSex = sexo.charAt(randInt);
				}
	
				String randomString =  sb.toString();
				System.out.println("Digite o nome da pessoa: " + randomString);
				System.out.println("Sexo: " + randomSex);

			}

		}
	}
}
