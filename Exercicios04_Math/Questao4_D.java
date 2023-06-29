import java.util.Scanner;

public class Questao4_D
{
    public static void main(String[] args)
    {
        Double comprimento, altura, perimetro;
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o valor do comprimento do retângulo: ");
        comprimento = ler.nextDouble();
        System.out.print("Digite o valor da altura do retângulo: ");
        altura = ler.nextDouble();
        perimetro = comprimento * 2 + altura * 2;

        System.out.println("Perímetro do retângulo: " + perimetro);
    }
}
