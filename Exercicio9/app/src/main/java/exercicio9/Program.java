package exercicio9;

/**
 * Faça um algoritmo que receba um valor que foi depositado e exiba o valor com
 * rendimento após um mês.Considere fixo o juro da poupança em 0,07% a. m;
 */

import java.util.Locale;
import java.util.Scanner;

public class Program {
  
  public static void main(String[] args) {
    
    try(Scanner sc = new Scanner(System.in)) {

      Locale.setDefault(Locale.US);

      double deposito;
      double rendimentoMensal;
      double jurosFixo = 0.07d;

      System.out.print("Valor a ser depositado: R$ ");
      deposito = sc.nextDouble();

      rendimentoMensal = deposito * jurosFixo / 100;
      deposito += rendimentoMensal;


      System.out.println();
      System.out.println("Valor depositado: R$" + String.format("%.2f", deposito) + 
                         " | Valor com rendimento de um mês: R$" + String.format("%.2f", rendimentoMensal));

    }
  }
}
