import java.util.Scanner;

public class Questao16
{
    public static void main(String[] args)
    {
        float valor, valorFinal, desconto;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor do produto: ");
        valor = ler.nextFloat();
        System.out.println("Digite o desconto do produto: ");
        desconto = ler.nextFloat();
        valorFinal = (valor / 100) * (100 - desconto);

        System.out.println("Valor final: " + valorFinal);
    }
}
