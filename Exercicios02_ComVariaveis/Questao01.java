import java.util.Scanner;

public class Questao01
{
  public static void main(String[] args)
  {
    String nome, cidade;
    Scanner ler = new Scanner(System.in);
    System.out.println("Digite o  seu nome: ");
    nome = ler.nextLine();
    System.out.println("Digite o nome da sua  cidade: ");
    cidade = ler.nextLine();

    System.out.println("Olá " + nome + ", você mora na cidade de " + cidade);
  }
}
