import java.util.Scanner;
import java.lang.Math;
public class Questao4_C
{
    public static void main(String[] args)
    {
        double cateto1, cateto2, somaCateto, resultado;
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o valor do primeiro cateto: ");
        cateto1 = ler.nextDouble();
        System.out.print("Digite o valor do segundo cateto: ");
        cateto2 = ler.nextDouble();
        somaCateto = Math.pow(cateto1, 2) + Math.pow(cateto2, 2);
        resultado = Math.sqrt(somaCateto);

        System.out.println("Valor da Hipotenusa: " + resultado);
    }
}
