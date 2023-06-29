import java.util.Scanner;
import java.lang.Math;

public class Questao2_D
{
    public static void main(String[] args) {
        double numero, absoluto;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o numero decimal: ");
        numero = ler.nextDouble();
        absoluto = (double) Math.abs(numero);
        System.out.println("O valor absoluto de " + numero + " é: " + absoluto);
    }
}