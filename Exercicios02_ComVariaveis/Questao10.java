import java.util.Scanner;

public class Questao10
{
  public static void main(String[] args)
  {
    int A, B, X;
    Scanner ler =  new Scanner(System.in);
    System.out.println("Digite o valor de A: ");
    A = ler.nextInt();
    System.out.println("Digite o valor de B: ");
    B = ler.nextInt();
    X = A;
    A = B;
    B = X;

    System.out.println("Valor de A: " + A + "\nValor de B: " + B);
  }
}
