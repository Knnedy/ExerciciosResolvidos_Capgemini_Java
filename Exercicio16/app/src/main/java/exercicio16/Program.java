package exercicio16;

/**
 * Escreva um algoritmo que leia o nome e as três notas obtidas por um aluno
 * durante o semestre. Calcular a sua média (aritmética), informar o nome e sua
 * menção aprovado (media >= 7), Reprovado (media <= 5) e Recuperação
 * (media entre 5.1 a 6.9)
 */

import java.util.Scanner;
import java.util.Locale;

public class Program {
  
  public static void main(String[] args) {
    
    try(Scanner sc = new Scanner(System.in)) {

      Locale.setDefault(Locale.US);
      
      String nome;
      double nota1;
      double nota2;
      double nota3;
      double media;

      System.out.println("Nome do aluno: ");
      nome = sc.nextLine();

      System.out.println("Entre com duas três notas: ");
      nota1 = sc.nextDouble();
      nota2 = sc.nextDouble();
      nota3 = sc.nextDouble();
      
      media = (nota1 + nota2 + nota3) / 3;

      if(media>= 7) {
        System.out.println("Nome do aluno: " + nome + 
        "\nSua média: " + String.format("%.1f", media) +
        "\nVOCÊ FOI APROVADO!" );
      }
      else if (media >= 5.0 && media <= 6.9) {
        System.out.println("Nome do aluno: " + nome + 
        "\nSua média: " + String.format("%.1f", media) +
        "\nVOCÊ ESTÁ EM RECUPERAÇÃO!");
      } 
      else {
        System.out.println("Nome do aluno: " + nome + 
        "\nSua média: " + String.format("%.1f", media) +
        "\nVOCÊ FOI REPROVADO!");
      }

    }
  }
}