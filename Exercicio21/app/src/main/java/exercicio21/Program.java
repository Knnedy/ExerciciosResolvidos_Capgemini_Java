package exercicio21;

/**
 * Escreva um algoritmo que leia os dados de “N” pessoas 
 * (nome, sexo, idade e saúde) e informe se está apta ou não para cumprir o 
 * serviço militar obrigatório. Informe os totais;
 */

import java.util.Scanner;

public class Program {

  public static void main(String[] args) {
    
    try(Scanner sc = new Scanner(System.in)) {

      String nome = "";
      char sexo =' ';
      int idade = 0;
      String saude = "";
    
      int totalCanditados = 0, totalAptos = 0;

      
      char continuar = 's';
      while (continuar == 's') {

        System.out.print("Digite seu Nome: ");
        nome = sc.next();
        sc.nextLine();
        System.out.print("Digite seu sexo: ");
        sexo = sc.next().charAt(0);
        System.out.print("Digite sua idade: ");
        idade = sc.nextInt();
        System.out.print("Digite sua saúde (boa/ruim): ");
        sc.nextLine();
        saude = sc.nextLine();

        
        if (sexo == 'M' || sexo == 'm') {
          if(idade >= 18 && idade <=45) {
            if(saude.equals("boa")) {
              totalAptos++;
              System.out.println("\nVocê é APTO!");
            }
            else {
              System.out.println("\n" + nome + "! Você é INAPTO! | Condição de saúde: " + saude);          
            }
          }
          else {
            System.out.println("\n" + nome + "! Você ainda nao tem/ou ja passou da idade do alistamento");
          }   
        }
        else {
          System.out.println("\n" + nome + "! O alistamento é obrigatório apenas para homens ");
        }
        
        totalCanditados++;

        System.out.print("\nDeseja continuar (s/n): ");
        continuar = sc.next().charAt(0);
      
      }      
      
      System.out.println("\nTotal de Candidatos: " + totalCanditados + 
      "\nTotal de aptos: " + totalAptos);
      

    }
  }
}