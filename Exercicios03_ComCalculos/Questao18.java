import java.util.Scanner;

public class Questao18
{
    public static void main(String[] args)
    {
        int idade, ano;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
        idade = ler.nextInt();
        System.out.println("Digite o ano em que esta: ");
        ano = ler.nextInt();

        System.out.println("Data de nascimento: " + (ano - idade));
    }
}
