import java.util.Scanner;

public class Questao03
{
  public static void main(String[] args)
  {
    int idade;
    Scanner ler = new Scanner(System.in);
    System.out.println("Digite a sua idade: ");
    idade = ler.nextInt();

    System.out.println("Idade: " + idade + " anos");
  }
}
