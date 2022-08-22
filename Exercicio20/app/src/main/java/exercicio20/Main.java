package exercicio20;

/**
 * -> Exercício 20 <-
 * A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos
 * com desconto. Faça um algoritmo que calcule e exiba o valor do desconto e o
 * valor a ser pago pelo cliente de vários carros. O desconto deverá ser
 * calculado de acordo com o ano do veículo. Até 2000 - 12% e acima de
 * 2000 - 7%. O sistema deverá perguntar se deseja continuar calculando
 * desconto até que a resposta seja: “(N) Não”. Informar total de carros com
 * ano até 2000 e total geral;
 */

import java.util.Locale;
import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {

    try(Scanner sc = new Scanner(System.in)) {

      Locale.setDefault(Locale.US);

      int anoFabricacao = 0;
      float valorVeiculo = 0.0f;
      float porcentagemDesconto = 0.0f;
      float valorDesconto = 0.0f;
      float valorPagar = 0.0f;
      
      int totalSemiNovos = 0;
      int totalVeiculos = 0;
      
      // "Flag" de parada
      char desejaContinuar = 's';

      while (desejaContinuar == 's' || desejaContinuar == 'S') {

        System.out.println("Digite o ano de fabricação do veículo: ");
        anoFabricacao = sc.nextInt();
        System.out.println("Digite o valor do veículo: ");
        valorVeiculo = sc.nextFloat();

        if(anoFabricacao <= 2000) {
          // 12%
          porcentagemDesconto = 0.12f;
        }
        else {
          // 7%
          porcentagemDesconto = 0.07f;
          totalSemiNovos++;
        }

        totalVeiculos++;

        valorDesconto = valorVeiculo  * porcentagemDesconto;
        valorPagar = valorVeiculo - valorDesconto;

        System.out.println();
        System.out.printf("O valor do desconto foi de: %.2f%n", valorDesconto);
        System.out.printf("O valor que deve pago é: R$%.2f%n", valorPagar);

        System.out.println();
        System.out.println("Deseja fazer mais cadastros (s/n)? ");
        desejaContinuar = sc.next().charAt(0);
      }

      System.out.println();
      System.out.println("TOTAL DE VEÍCULOS SEMI NOVOS: " + totalSemiNovos);
      System.out.println("TOTAL DE VEÍCULOS: " + totalVeiculos);

    }     
  }
}
