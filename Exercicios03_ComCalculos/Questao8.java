import java.util.Scanner;

public class Questao8
{
   public static void main(String[] args)
   {
      float valor;
      Scanner ler = new Scanner(System.in);
      System.out.println("Digite o valor do produto: ");
      valor = ler.nextFloat();
      System.out.println("Valor descontado: " + (valor / 100)*10 + "\nValor final do produto: " + (valor / 100)*90);
   }
}
