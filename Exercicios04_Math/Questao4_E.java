import java.util.Scanner;

public class Questao4_E
{
    public static void main(String[] args)
    {
        double base, altura, area;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o comprimento da base do triângulo: ");
        base = ler.nextDouble();
        System.out.println("Digite o comprimento da altura do triângulo: ");
        altura = ler.nextDouble();
        area = base * altura / 2;

        System.out.println("Área do triângulo: " + area);
    }
}
