import java.lang.Math;
import java.util.Scanner;

public class Questao1
{
    public static void main(String[] args)
    {
        double valorX, valorY, pot1 = 0, pot2 = 0, resultado;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o valor de X: ");
        valorX = ler.nextDouble();
        System.out.println("Digite o valor de Y: ");
        valorY = ler.nextDouble();
        pot1 = Math.pow(valorX * 2 - valorX * 1, 2);
        pot2 = Math.pow(valorY * 2 - valorY * 1, 2);
        resultado = Math.sqrt(pot1 + pot2);

        System.out.println("Resultado: " + resultado);
    }
}
