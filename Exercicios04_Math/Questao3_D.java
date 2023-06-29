import java.util.Scanner;
import java.lang.Math;

public class Questao3_D
{
    public static void main(String[] args) {
        double angulo, arcoTangente;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor: ");
        angulo = ler.nextDouble();
        arcoTangente = Math.acos(angulo);
        System.out.println("Arco tangente: " + arcoTangente);
    }
}