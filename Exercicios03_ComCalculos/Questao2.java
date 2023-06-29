import java.util.Scanner;
import java.lang.Math;

public class Questao2
{
    public static void main(String[] args)
    {
        double raio, area;
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o raio do circulo: ");
        raio = ler.nextDouble();
        area = raio * raio * Math.PI;
        System.out.println("Área do circulo: " + area);

    }
}
