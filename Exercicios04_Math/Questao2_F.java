import java.lang.Math;
import java.util.Scanner;

public class Questao2_F
{
    public static void main(String[] args)
    {
        double valor1, valor2, minimo;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        valor1 = ler.nextDouble();
        System.out.println("Digite o segundo valor: ");
        valor2 = ler.nextDouble();
        minimo = Math.min(valor1, valor2);

        System.out.println("Minímo: " + minimo);
    }
}
