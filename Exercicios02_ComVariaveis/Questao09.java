import java.util.Scanner;

public class Questao09
{

  public static void main(String[] args)
  {
    String nome, rua, cidade, estado, CEP, CPF, telefone;
    int numeroCasa;
    Scanner ler = new Scanner(System.in);
    System.out.println("Digite o seu nome: ");
    nome = ler.nextLine();
    System.out.println("Digite o nome da sua rua: ");
    rua = ler.nextLine();
    System.out.println("Digite o número da sua casa: ");
    numeroCasa = ler.nextInt();
    ler.nextLine();
    System.out.println("Digite o seu CEP: ");
    CEP = ler.nextLine();
    System.out.println("Digite o nome da sua Cidade: ");
    cidade = ler.nextLine();
    System.out.println("Digite o nome do seu estado: ");
    estado = ler.nextLine();
    System.out.println("Digite o seu CPF: ");
    CPF = ler.nextLine();
    System.out.println("Digite o seu número de telefone: ");
    telefone = ler.nextLine();

    System.out.print("\nNome........: " + nome);
    System.out.print("\nEndereço....: RUA " + rua + ", NUMERO: " + numeroCasa + ", CEP: " + CEP);
    System.out.print("\nCidade......: " + cidade);
    System.out.print("\nEstado......: " + estado);
    System.out.print("\nCPF.........: " + CPF);
    System.out.print("\nNum.Telefone: (48) " + telefone);
  }
}
