package exercicio25;

/**
 * Faça um algoritmo que leia dois números e identifique se são iguais ou
 * diferentes. Caso eles sejam iguais imprima uma mensagem dizendo que eles são
 * iguais. Caso sejam diferentes, informe qual número é o maior, e uma
 * mensagem que são diferentes
 */

import java.util.Scanner;

public class Program {

  public static void main(String[] args) {
    
    try(Scanner sc = new Scanner(System.in)) {

      int n1 = 0;
      int n2 = 0;
      int result = 0;

      System.out.println("Leia dois números: ");
      n1 = sc.nextInt();
      n2 = sc.nextInt();

      if(n1 != n2) {
        if(n1 > n2) {
          result = n1;
          System.out.println("Os números " + n1 + " e " + n2 + " são diferentes.");
          System.out.println("O número " + result + " é o maior.");
        }
      }
      else {
        System.out.println("Os números " + n1 + " e " + n2 + " são iguais.");
      }

    }
  }
}
