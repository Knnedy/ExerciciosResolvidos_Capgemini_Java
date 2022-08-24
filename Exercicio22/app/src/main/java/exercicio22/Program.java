package exercicio22;

/**
 * Faça um algoritmo que receba o preço de custo e o preço de venda de 40 produtos.
 * Mostre como resultado se houve lucro, prejuízo ou empate para cada produto.
 * Informe o valor de custo de cada produto, o valor de venda de cada produto,
 * a média de preço de custo e do preço de venda
 */

import java.util.Locale;
import java.util.Scanner;

public class Program {

  public static void main(String[] args) {
  
    try(Scanner sc = new Scanner(System.in)) {

      Locale.setDefault(Locale.US);

      double lucroTotal = 0.0d, totalCusto = 0.0d, totalVendas = 0.0d; 
      double precoDeCusto = 0.0d, precoDeVenda = 0.0d;  
      double lucroUnitario = 0.0d, prejuizoUnitario = 0.0d;
      double mediaVendas = 0.0d, mediaCusto = 0.0d;
      int counter = 0; // Contador

      System.out.print("Quantas vezes você quer fazer esta verificação? ");
      counter = sc.nextInt();
      
      for (int i = 0; i < counter; i++) {
        System.out.println("Digite o preço de custo e o preço de venda respectivamente: ");
        precoDeCusto = sc.nextDouble();
        precoDeVenda = sc.nextDouble();

        lucroUnitario = precoDeVenda  - precoDeCusto;
        prejuizoUnitario = precoDeCusto - precoDeVenda;

        totalCusto += precoDeCusto;
        totalVendas += precoDeVenda;
        lucroTotal = totalVendas - totalCusto;

        if( precoDeVenda == precoDeCusto) {
          System.out.println("HOUVE EMPATE!\n");
        }
        else if (precoDeVenda > precoDeCusto) {
          System.out.println("\nPREÇO DE CUSTO: R$ " + String.format("%.2f", precoDeCusto));
          System.out.println("PREÇO DE VENDA: R$ " + String.format("%.2f", precoDeVenda));
          System.out.println("\nHOUVE LUCRO DE R$ " + String.format("%.2f", lucroUnitario) + "\n");
        }
        else {
          System.out.println("\nPREÇO DE CUSTO: R$ " + String.format("%.2f", precoDeCusto));
          System.out.println("PREÇO DE VENDA: R$ " + String.format("%.2f", precoDeVenda));
          System.out.println("HOUVE PREJUÍZO DE R$" + String.format("%.2f%n", prejuizoUnitario) + "\n");
        }

      }
      mediaCusto = totalCusto / counter;
      mediaVendas = totalVendas / counter;

      System.out.println("lUCRO TOTAL: R$ " + String.format("%.2f", lucroTotal));
      System.out.println("MÉDIA DE CUSTO: R$ " + String.format("%.2f", mediaCusto));
      System.out.println("MÉDIA DE VENDAS R$ " + String.format("%.2f", mediaVendas));

    }
  }
}
