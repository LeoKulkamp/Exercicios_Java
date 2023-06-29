import java.util.Scanner;
import java.lang.Math;

public class Questao22_MaiorNumero
{
    public static void main(String[] args)
    {
        int numero1, numero2, maiorNumero;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        numero1 = ler.nextInt();
        System.out.println("Digite o segundo numero: ");
        numero2 = ler.nextInt();
        maiorNumero = Math.max(numero1, numero2);
        System.out.println("Maior numero: " + maiorNumero);
    }
}
