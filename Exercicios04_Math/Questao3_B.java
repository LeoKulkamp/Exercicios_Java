import java.util.Scanner;
import java.lang.Math;

public class Questao3_B
{
    public static void main(String[] args) {
        double angulo, arcoSeno;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor: ");
        angulo = ler.nextDouble();
        arcoSeno = Math.asin(angulo);
        System.out.println("Arco seno: " + arcoSeno);
    }
}
