import java.util.Scanner;

public class Questao9
{
   public static void main(String[] args)
   {
      float litros, valor, total;
      Scanner ler = new Scanner(System.in);
      System.out.println("Digite a quantidade de litros abastecidos: ");
      litros = ler.nextFloat();
      System.out.println("Digite o valor do litro de combustivel: ");
      valor = ler.nextFloat();
      total = litros * valor;
      System.out.println("Valor total a ser pago: " + total);
   }
}
