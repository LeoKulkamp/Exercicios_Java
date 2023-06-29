import java.util.Scanner;

public class Questao6
{
   public static void main(String[] args)
   {
      int horas, minutos, segundos, dias;
      Scanner ler = new Scanner(System.in);
      System.out.print("Digite a quantidade de dias: ");
      dias = ler.nextInt();
      System.out.print("Digite a quantidade de horas: ");
      horas = ler.nextInt();
      System.out.print("Digite a quantidade de minutos: ");
      minutos = ler.nextInt();
      System.out.print("Digite a quantidade de segundos: ");
      segundos = ler.nextInt();
      horas += dias * 24;
      minutos += horas * 60;
      segundos += minutos * 60;

      System.out.println("total de segundos: " + segundos);
   }
}
