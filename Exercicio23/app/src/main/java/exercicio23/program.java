package exercicio23;

/**
 * Faça um algoritmo que receba um número e mostre uma mensagem caso este
 * número seja maior que 80, menor que 25 ou igual a 40
 */

 import java.util.Scanner;

public class program {
  
  public static void main(String[] args) {
    
    try(Scanner sc = new Scanner(System.in)) {

      System.out.print("Digite um número: ");
      int n = sc.nextInt();

      if (n < 25) {
        System.out.println("O número " + n + " é menor que 25.");
      }

      if (n > 80) {
        System.out.println("O número " + n + " é maior que 80.");
      }
      
      if (n == 40) {
        System.out.println("O número " + n + " é igual a 40.");
      }

      
    }
  }
}
