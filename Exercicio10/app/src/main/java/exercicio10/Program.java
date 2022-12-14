package exercicio10;

/**
 * A Loja Mamão com Açúcar está vendendo seus produtos em 5 (cinco) prestações
 * sem juros. Faça um algoritmo que receba um valor de uma compra e mostre o
 * valor das prestações
 */

import java.util.Scanner;
import java.util.Locale;

public class Program {
  
  public static void main(String[] args) {
    
    try(Scanner sc = new Scanner(System.in)) {

      Locale.setDefault(Locale.US);

      double valorDaCompra;
      double parcelas;

      System.out.print("Valor da compra: R$");
      valorDaCompra = sc.nextDouble();

      System.out.print("Quantas parcelas? ");
      parcelas = sc.nextDouble();

      double valorParcelas = valorDaCompra / parcelas;

      //System.out.print("Total da compra: R$" + String.format("%.2f", valorDaCompra) + 
      //                 " | Valor das Parcelas: R$" + String.format("%.2f", parcelas));

      for (int i = 0; i<=valorParcelas;i++) {
      System.out.println("O valor da "+i+ "a parcela é de R$ " + String.format("%.2f", valorParcelas));
      }


    } 
  }
}
