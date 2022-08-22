package exercicio13;

/**
 * Faça um algoritmo que receba um número e mostre uma mensagem caso este
 * número seja maior que 10
 */

import java.util.Scanner;

public class App {

  public static void main(String[] args) {

    try(Scanner sc = new Scanner(System.in)) {

      System.out.print("Digite um número: ");
      int number = sc.nextInt();

      if(number > 10) {
        System.out.print("Maior que 10");
      }
      else {
        System.out.print("Menor que 10");
      }
    
    }  
  }
}
