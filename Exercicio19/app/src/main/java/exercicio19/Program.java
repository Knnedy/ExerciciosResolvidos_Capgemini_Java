package exercicio19;

/**
 * Escreva um algoritmo que leia o nome e o sexo de 56 pessoas e informe o nome
 * e se ela é homem ou mulher. No final informe total de homens e de mulheres
 */

import java.util.Scanner;
import java.util.Random;

public class Program {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)) {
			
/* 			String nome;
			char sexo;

			int mas = 0, fem = 0;

			for(int i = 0; i < 5; i++) {
				// Leia o nome
				System.out.print("Digite o seu nome: ");
				nome = sc.nextLine();
				
				// Leia o sexo
				System.out.print("Seu sexo [Masculino/Feminino]: ");
				sexo = sc.next().charAt(0);
				sc.nextLine();
	
				if(sexo == 'M' || sexo == 'm') {
					mas ++;
				}
				else{
					fem ++;
				}

				System.out.println("Nome: " + nome);
				System.out.println("Sexo: " + sexo + "\n");
			}
			System.out.println("Homens: " + mas + " | Mulheres: " + fem); */

			// randomizando String
			Random rand = new Random();

			String alpha = "abcdefghijklmnopqrstuvwxyz";
			StringBuilder sb = new StringBuilder();

			// randomizando Char
			String sexo = "fm";
			
			int lenght = 8;
			
			int randInt;
			char randomSex = 0;
			
			for(int i = 0; i < lenght; i++) {
				int index = rand.nextInt(alpha.length());
				char randomChar = alpha.charAt(index);
				sb.append(randomChar);

				randInt = rand.nextInt(sexo.length());
				randomSex = sexo.charAt(randInt);
			}

			String randomString = sb.toString();
			System.out.println("Digite o nome da pessoa: " + randomString);
			System.out.println("Sexo: " + randomSex);

		}
	}
}
