package exercicio14;

/**
 * Escreva um algoritmo que leia dois valores
 * inteiro distintos e informe qual é o maior
 */

import java.util.Scanner;

public class Program {  

  public static void main(String[] args) {

    try(Scanner sc = new Scanner(System.in)) {

      int maior = 0;

      System.out.println("Digite dois números:");
      int a = sc.nextInt();
      int b = sc.nextInt();

      if (a > b) {
        maior = a;
        System.out.println("O maior é:" + maior);
      }
      else {
        maior = b;
        System.out.println("O maior é:" + maior);
      }

    }
  }
}
