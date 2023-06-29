import java.util.Scanner;

public class Questao05
{
  public static void main(String[] args)
  {
    float numero;
    Scanner ler = new Scanner(System.in);
    System.out.println("Digite um numero decimal: ");
    numero = ler.nextFloat();

    System.out.println("Confirmação: " + numero);
  }
}