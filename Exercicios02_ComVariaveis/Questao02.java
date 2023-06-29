import java.util.Scanner;

public class Questao02
{
  public static void main(String[] args)
  {
    String nome;
    Scanner ler = new Scanner(System.in);
    System.out.println("Digite o seu nome: ");
    nome = ler.nextLine();

    System.out.println("Seja bem vindo " + nome);
  }
}
