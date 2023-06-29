import java.util.Scanner;

public class Questao11 {
   public static void main(String[] args)
   {
      int numero, quadrado;
      Scanner ler = new Scanner(System.in);
      System.out.println("Digite um numero: ");
      numero = ler.nextInt();
      quadrado = numero * numero;
      System.out.println("o resultado sera: " + quadrado);
   }
}
