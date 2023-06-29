import java.util.Scanner;

public class Questao10
{
   public static void main(String[] args)
   {
      int dias;
      float valor, total;
      Scanner ler = new Scanner(System.in);
      System.out.println("Digite a quantidade de dias que o carro foi alugado: ");
      dias = ler.nextInt();
      System.out.println("Digite o valor da diaria: ");
      valor = ler.nextFloat();
      total = dias * valor;
      System.out.println("o valor total a ser pago sera: " + total);

   }
}
