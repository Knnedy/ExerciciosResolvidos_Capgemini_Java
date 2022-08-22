package exercicio18;

/**
 * Faça um algoritmo que receba a idade de 75 pessoas e mostre mensagem informando
 * “maior de idade” e “menor de idade” para cada pessoa. Considere a idade a
 * partir de 18 anos como maior de idade;
 */


import java.util.Scanner;
import java.util.Random;

public class Program {

  public static void main(String[] args) {

    try(Scanner sc = new Scanner(System.in)) {

      Random random = new Random();

      int idade = 18;

      for(int i = 1; i <=75; i++) {
        idade = random.nextInt(80);
        System.out.println("Digite sua idade: ");

        if(idade >= 18) {
          System.out.println("Maior de idade: " + idade + "\n");
        }
        else {
          System.out.println("Menor de idade: " + idade + "\n");
        }
      }

    }
  }
}
