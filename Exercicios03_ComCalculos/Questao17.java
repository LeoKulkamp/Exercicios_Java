import java.util.Scanner;

public class Questao17
{
    public static void main(String[] args)
    {
        float valor, valorParcelas;
        int parcela;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor do produto: ");
        valor = ler.nextFloat();
        System.out.println("Digite o numero de parcelas: ");
        parcela = ler.nextInt();
        valorParcelas = valor / parcela;

        System.out.println("Valor da parcela: " + valorParcelas);
    }
}
