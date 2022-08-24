package exercicio19;

/**
 * Escreva um algoritmo que leia o nome e o sexo de 56 pessoas e informe o nome
 * e se ela é homem ou mulher. No final informe total de homens e de mulheres.
 */

import java.util.Random;

public class Program {

	public static void main(String[] args) {

		Random rand = new Random();
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String sexo = "MF";
		String randomString = "";

		int homem = 0, mulher = 0;
		int randInt;
		char randomSex = 0;
		int lenghtStr = 7;
		int index =  -1;

		for(int i = 0; i < 56; i++) {
			randomString = "";
			for(int j = 0; j < lenghtStr; j++){
				// randomizando o nome
				index = rand.nextInt(alphabet.length());
				randomString += alphabet.substring(index, index + 1);

			}
			
			// randomizando o sexo
			randInt = rand.nextInt(sexo.length());
			randomSex = sexo.charAt(randInt);

			if(randomSex == 'M') {
				homem++;
			}
			else {
				mulher++;
			}
			
			System.out.println("Nome: " + randomString);
			System.out.println("Sexo: " + randomSex);
		}
		
		System.out.println("Total de Homens: " + homem);
		System.out.println("Total de Mulheres: " + mulher);
	
	}
}

