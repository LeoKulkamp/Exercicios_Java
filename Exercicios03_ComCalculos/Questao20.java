import java.util.Scanner;

public class Questao20
{
    public static void main(String[] args)
    {
        float lado;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o lado do quadrado: ");
        lado = ler.nextFloat();

        System.out.println("Área do quadrado: " + lado * lado);
    }
}
