package exercicio6;

/**
 * Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores 
 * de forma que a variável A passe a possuir o valor da variável B e a variável B
 * passe a possuir o valor da variável A.
 * Apresentar os valores trocados
 */

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
      
    try(Scanner sc = new Scanner(System.in)) {

      int A;
      int B;
      int aux;

      System.out.print("Valor de A: " );
      A = sc.nextInt();

      System.out.print("Valor de B: " );
      B = sc.nextInt();

      aux = A; // variável AUXILIAR que vai receber o valor de A temporariamente
      A = B;
      B = aux; // Aqui B receebe o valor de A que está na variável aux

      System.out.println("O valor de A é: " + A);
      System.out.println("O valor de B é: " + B);

    }
  }
}
