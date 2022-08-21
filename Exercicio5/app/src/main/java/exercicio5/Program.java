package exercicio5;

import java.util.Locale;
import java.util.Scanner;

/**
 * Escreva um algoritmo que leia o nome de um aluno e as notas das três provas
 * que ele obteve no semestre. No finalinformar o nome do aluno e a sua média
 * (aritmética);
 */

public class Program {
    
  public static void main(String[] args) {
    
    try(Scanner sc = new Scanner(System.in)) {

      Locale.setDefault(Locale.US);

      String nome;
      float nota1;
      float nota2;
      float nota3;
      float media;

      System.out.print("Nome do aluno: ");
      nome = sc.nextLine();
      
      System.out.println("Nota 1");
      nota1 = sc.nextFloat();

      System.out.println("Nota 2");
      nota2 = sc.nextFloat();

      System.out.println("Nota 3");
      nota3 = sc.nextFloat();

      media = (nota1 + nota2 + nota3) / 3;
      
      System.out.println("Aluno: " + nome + " | Média aritmética: " + String.format("%.2f", media));
      
    }
  }
}