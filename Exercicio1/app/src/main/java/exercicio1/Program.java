package exercicio1;

import java.util.Scanner; 

public class Program {

  public static void main(String[] args) {
    
    try (Scanner sc = new Scanner(System.in)) {

      int xA, xB;
      int soma;

    
      System.out.print("x1: ");
      xA = sc.nextInt();
      System.out.print("x2: ");
      xB = sc.nextInt();
      
      soma =  xA + xB;

      System.out.println();
      System.out.println("A soma é:  " + soma);



    }
  }
}
