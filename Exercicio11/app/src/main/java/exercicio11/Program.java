package exercicio11;

/**
 * Faça um algoritmo que receba o preço de custo de um produto e mostre o valor
 * de venda. Sabe-se que o preço de custo receberá um acréscimo de acordo com
 * um percentual informado pelo usuário
 */

import java.util.Scanner;
import java.util.Locale;

public class Program {

  public static void main(String[] args) {
    
    try(Scanner sc = new Scanner(System.in)) {

      Locale.setDefault(Locale.US);

      double custo, venda, percentual;

      System.out.print("Custo do produto: ");
      custo = sc.nextDouble();

      System.out.print("Digite o percentual para a venda: ");
      percentual = sc.nextDouble();

      percentual = (percentual / 100) * custo;
      venda = custo + percentual;

      System.out.print("O valor de venda é: R$" + String.format("%.2f", venda));

    }
  }
}
