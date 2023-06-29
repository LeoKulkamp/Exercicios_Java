import java.util.Scanner;

public class Questao13
{
    public static void main(String[] args)
    {
        float valor;
        int quantidade;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor do produto: ");
        valor = ler.nextFloat();
        System.out.println("Digite a quantidade: ");
        quantidade = ler.nextInt();

        System.out.println("Valor total: " + valor * quantidade);
    }
}
