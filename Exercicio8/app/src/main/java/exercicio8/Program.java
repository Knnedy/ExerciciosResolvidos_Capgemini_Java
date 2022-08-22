package exercicio8;

/*
 * Elabore um algoritmo que efetue a apresentação do valor da conversão em real
 * (R$) de um valor lido em dólar (US$). O algoritmo deverá solicitar o valor
 * da cotação do dólar e também aquantidade de dólares disponíveis com o
 * usuário
 */

import java.util.Scanner;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)) {

			Locale.setDefault(Locale.US);

			double cotacaoDollar; // Cotação atual
			double meuDollar;
			double dollarConvertido;

			System.out.print("Cotação atual do dollar: US$");
			cotacaoDollar = sc.nextDouble();

			System.out.print("Quantos doláres você tem? ");
			meuDollar = sc.nextDouble();

			dollarConvertido = meuDollar * cotacaoDollar;

			System.out.println("Convertendo US$" + String.format("%.2f", meuDollar) + 
												 " para R$" + String.format("%.2f", dollarConvertido));
												 										 
		}
	}
}
