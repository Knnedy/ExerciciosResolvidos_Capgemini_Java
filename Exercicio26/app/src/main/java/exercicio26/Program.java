package exercicio26;

/**
 * Faça um algoritmo que leia um número de 1 a 5 e escreva por extenso.
 * Caso o usuário digite um número que não esteja neste intervalo, exibir
 * a seguinte mensagem: número inválido
 */

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    
    try(Scanner sc = new Scanner(System.in)) {

      String um = "um";
      String dois = "dois";
      String tres = "tres";
      String quatro = "quatro";
      String cinco = "cinco";

      int n = 0;

      System.out.print("digite um número: ");
      n = sc.nextInt();
      
      if (n == 1) {
        System.out.print("O número " + n + " escrito por extenso: " + um);
      }
      else if (n == 2) {
        System.out.print("O número " + n + " escrito por extenso: " + dois);
      }
      else if (n == 3) {
        System.out.print("O número " + n + " escrito por extenso: " + tres);
      }
      else if (n == 4) {
        System.out.print("O número " + n + " escrito por extenso: " + quatro);
      }
      else if (n == 5) {
        System.out.print("O número " + n + " escrito por extenso: " + cinco);
      }
      else {
        System.out.print("O número está fora do intervalo.");
      }

    }
  }
}
