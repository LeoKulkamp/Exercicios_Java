import java.util.Scanner;

public class Questao3
{
    public static void main(String[] args)
    {
        float base, altura, area;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a base do triângulo: ");
        base = ler.nextFloat();
        System.out.println("Digite a altura do triângulo: ");
        altura = ler.nextFloat();
        area = base * altura;
        System.out.println("Área do triângulo: " + area);

    }
}
