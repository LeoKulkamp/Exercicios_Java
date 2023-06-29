import java.util.Scanner;

public class Questao06
{
  public static void main(String[] args)
  {
    int numero1, numero2;
    Scanner ler = new Scanner(System.in);
    System.out.println("Digite o primeiro número: ");
    numero1 = ler.nextInt();
    System.out.println("Digite o  segundo número: ");
    numero2 = ler.nextInt();

    System.out.println("Primeiro número: " + numero1 + "\nSegundo número: " + numero2);
  }
}