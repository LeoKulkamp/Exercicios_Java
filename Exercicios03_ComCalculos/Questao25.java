import java.util.Scanner;

public class Questao25
{
    public static void main(String[] args)
    {
        float dolar, real;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor em dólar: ");
        dolar = ler.nextFloat();
        real = (float) (dolar * 4.778);

        System.out.println("Valor em real: R$" + real);
    }
}
