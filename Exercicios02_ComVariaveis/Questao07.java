import java.util.Scanner;

public class Questao07
{
  public static void main(String[] args)
  {
    String nome, cidade;
    int idade;
    Scanner ler = new Scanner(System.in);
    System.out.println("Digite o seu nome: ");
    nome = ler.nextLine();
    System.out.println("Digite o nome da sua cidade: ");
    cidade = ler.nextLine();
    System.out.println("Digite a sua idade : ");
    idade = ler.nextInt();

    System.out.println("Nome: " + nome + "\nCidade: " + cidade + "\nIdade: " +idade);
  }
}
