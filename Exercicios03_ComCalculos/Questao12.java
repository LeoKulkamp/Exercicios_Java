import java.util.Scanner;

public class Questao12 {
   public static void main(String[] args)
   {
      float valor,acrecimo, valorFinal;
      int resultado;
      Scanner ler = new Scanner(System.in);
      System.out.println("digite o valor do produto: ");
      valor = ler.nextFloat();
      acrecimo = (valor / 100) * 15;
      valorFinal = (valor / 100) *115;
      System.out.println("Acréscimo: " + acrecimo + "\nValor final: " + valorFinal);

   }
}
