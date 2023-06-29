import java.util.Scanner;

public class Questao7
{
   public static void main(String[] args)
   {
      float valor1, valor2, multiplicacao;
      Scanner ler = new Scanner(System.in);
      System.out.println("Digite o primeiro valor: ");
      valor1 = ler.nextFloat();
      System.out.println("Digite o segundo valor: ");
      valor2 = ler.nextFloat();
      multiplicacao = valor1 * valor2;
      System.out.println("Multiplicação: " + multiplicacao);
   }
}
