import java.util.Scanner;

public class Questao04
{
  public static void main(String[] args)
  {
    int numero;
    Scanner ler = new Scanner(System.in);
    System.out.println("Digite um numero inteiro: ");
    numero = ler.nextInt();

    System.out.println("Confirmação: " + numero);
  }
}