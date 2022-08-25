package exercicio24;

/**
 * Faça um algoritmo que receba “N” números e mostre positivo,
 * negativo ou zero para cada número
 */

 import java.util.Scanner;

public class Program {
  
  public static void main(String[] args) {
  

    try(Scanner sc = new Scanner(System.in)) {

      int n = 1; 
      
      while (n != 0) {
        System.out.print("Digite um número: ");
        n = sc.nextInt();

        if (n > 0) {
          System.out.println("O número " + n + " é POSITIVO.");
        }
        else if (n < 0) {
          System.out.println("O número " + n + " é NEGATIVO.");
        }
        else {
          System.out.println("O número " + n + " é IGUAL a zero.");  
        }
      
      }
    }
  }
}
