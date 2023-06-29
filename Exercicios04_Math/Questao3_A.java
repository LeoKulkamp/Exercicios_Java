import java.util.Scanner;
import java.lang.Math;

public class Questao3_A
{
    public static void main(String[] args) {
        double angulo, cosseno;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor do ângulo: ");
        angulo = ler.nextDouble();
        cosseno = Math.tan(angulo);
        System.out.println("Tangente: " + cosseno);
    }
}
