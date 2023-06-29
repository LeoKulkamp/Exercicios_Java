import java.util.Scanner;

public class Questao4
{
    public static void main(String[] args)
    {
        float fahrenheit, celsius;
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite a temporatura: ");
        celsius = ler.nextFloat();
        fahrenheit = (celsius * 9/ 5) + 32;
        System.out.println("Fahrenheit: " + fahrenheit);
    }
}
