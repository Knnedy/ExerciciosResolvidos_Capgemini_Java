package exercicio4;

import java.util.Locale;
import java.util.Scanner;

/**
 * Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o
 * total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este
 * vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o seu
 * nome, o salário fixo e salário no final do mês
 */

public class Program {
    
  public static void main(String[] args) {
    
    try(Scanner sc = new Scanner(System.in)) {

      Locale.setDefault(Locale.US);

      String nome;
      double salarioFixo;
      double totalVendas;
      double salarioFinal;
      double comissao;

      System.out.print("Nome do vendedor: ");
      nome = sc.nextLine().toUpperCase();
      
      System.out.print("Salario do vendedor: R$");
      salarioFixo = sc.nextDouble();

      System.out.print("Total vendas: ");
      totalVendas = sc.nextDouble();

      comissao = 0.15 * totalVendas;
      salarioFinal = comissao + salarioFixo;

      System.out.println();
      System.out.println("Nome do vendedor: " + nome);
      System.out.println("Salário fixo: R$ " + String.format("%.2f", salarioFixo));
      System.out.println("Salário final: R$ " + String.format("%.2f", salarioFinal));
      
    }
  }
}