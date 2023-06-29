import java.lang.Math;
import java.util.Scanner;

public class Questao2_E
{
    public static void main(String[] args)
    {
        double valor1, valor2, maximo;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        valor1 = ler.nextDouble();
        System.out.println("Digite o segundo valor: ");
        valor2 = ler.nextDouble();
        maximo = Math.max(valor1, valor2);

        System.out.println("Maxímo: " + maximo);
    }
}
