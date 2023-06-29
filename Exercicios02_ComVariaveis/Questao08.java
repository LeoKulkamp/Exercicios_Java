import java.util.Scanner;

public class Questao08
{
  public static void main(String[] args)
  {
    int numeroInt;
    float numeroDec;
    Scanner ler = new Scanner(System.in);
    System.out.println("Digite um número inteiro: ");
    numeroInt = ler.nextInt();
    System.out.println("Digite um número decimal: ");
    numeroDec = ler.nextFloat();

    System.out.println("Número inteiro: " + numeroInt + "\nNúmero decimal: " + numeroDec);
  }
}