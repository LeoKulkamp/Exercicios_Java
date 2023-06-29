import java.util.Scanner;
import java.lang.Math;

public class Questao23
{
    public static void main(String[] args)
    {
        float numero, raiz, potencia;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        numero = ler.nextFloat();
        raiz = (float) Math.sqrt(numero);
        potencia = (float) Math.pow(numero, 2);

        System.out.println("Raíz: " + raiz + "\nPotencia: " + potencia);
    }
}
