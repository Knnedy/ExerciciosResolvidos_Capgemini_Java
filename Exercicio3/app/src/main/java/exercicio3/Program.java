package exercicio3;

import java.util.Locale;
import java.util.Scanner;

/**
 * Escreva um algoritmo para determinar o consumo médio de um automóvel sendo 
 * fornecida a distância total percorrida pelo automóvel e o total de
 * combustível gasto
 */

public class Program {

  public static void main(String[] args) {
  
    try(Scanner sc = new Scanner(System.in)) {

      Locale.setDefault(Locale.US);

      double distanciaPercorrida;
      double combustivelGasto;
      double consumoMedio;

      System.out.print("Distância total percorrida pelo automóvel: ");
      distanciaPercorrida = sc.nextDouble();

      System.out.print("Total de combustivel gasto: ");
      combustivelGasto = sc.nextDouble();

      consumoMedio = distanciaPercorrida / combustivelGasto;

      System.out.print("Consumo médio de combustivel do veículo: " + String.format("%.2f", consumoMedio) + "Lts.");
      
    }
  }
}
