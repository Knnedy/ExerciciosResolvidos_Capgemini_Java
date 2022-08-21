package exercicio7;

import java.util.Locale;
import java.util.Scanner;

/**
 * Leia uma temperatura em graus Celsius e apresentá-la convertida em graus
 * Fahrenheit. A fórmula de conversão é: F=(9*C+160) / 5, sendo F a temperatura
 * em Fahrenheit e C a temperatura em Celsius
 */

public class Program {

	public static void main(String[] args) {
	
    try(Scanner sc = new Scanner(System.in)){

      Locale.setDefault(Locale.US);

      double celsius;
      double fahrenheit;

      System.out.print("Digite a temperatura em graus Celsius: ");
      celsius = sc.nextDouble();
      
      // fórmula de conversão
      fahrenheit = (9 * celsius + 160.0d) / 5;

      System.out.print("Mesma temperatura em Fahrenheit: " + String.format("%.2f", fahrenheit));
    
    }
  }
}
