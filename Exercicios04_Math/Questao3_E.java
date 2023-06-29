import java.util.Scanner;
import java.lang.Math;

public class Questao3_E
{
    public static void main(String[] args)
    {
        double valor, logaritmo;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor: ");
        valor = ler.nextDouble();
        logaritmo = Math.log(valor);

        System.out.println("Logaritmo natural: " + logaritmo);
    }
}
