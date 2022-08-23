package exercicio15;

/**
 * Faça um algoritmo que receba um número e diga se este número
 * está no intervalo entre 100 e 200
 */

import java.util.Scanner;

public class Program {
  
  public static void main(String[] args) {
    
    try(Scanner sc = new Scanner(System.in)) {

      System.out.print("Digite um número: ");
      int x = sc.nextInt();

      if (x >= 10 && x <= 200){
        System.out.println("O número" + x + " está no intervalo!");
      }
      else {
        System.out.println("O número " + x + " não está no intervalo!");
      }

    }
  }
}
