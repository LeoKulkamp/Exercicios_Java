import java.util.Scanner;
import java.lang.Math;

public class Questao4_A
{
    public static void main(String[] args)
    {
        double raio, resultado;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o raio do circulo: ");
        raio = ler.nextDouble();
        resultado = raio * raio * Math.PI;

        System.out.println("Área do circulo: " + resultado);
    }
}
