import java.util.Scanner;
import java.lang.Math;

public class Questao4_B
{
    public static void main(String[] args)
    {
        double raio, resultado;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o raio do circulo: ");
        raio = ler.nextDouble();
        resultado = 2 * raio * Math.PI;

        System.out.println("Circunferência do circulo: " + resultado);
    }
}
