package exercicio2;

import java.util.Scanner;

/**
 * Faça um algoritmo que receba dois números e ao final mostre a soma,
 * subtração, multiplicação e a divisão dos dois números lidos 
 */

public class Program {
  
  public static void main(String[] args) {
  
    try(Scanner sc = new Scanner(System.in)) {

      System.out.print("X: ");
      int x = sc.nextInt();
      System.out.print("Y: ");
      int y = sc.nextInt();

      int soma = x + y;
      int subtracao = x - y;
      int multiplicacao = x * y;
      int divisao = x / y;

      System.out.println("Soma: " + soma);
      System.out.println("Subtração: " + subtracao);
      System.out.println("Multiplicação: " + multiplicacao);
      System.out.println("Divisão: " + divisao);

    }
  }
}
