import java.util.Scanner;

public class Questao5
{
    public static void main(String[] args)
    {
        double hipotenusa, oposto, subtracao, adjacente;
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o valor da hipotenusa: ");
        hipotenusa = ler.nextDouble();
        System.out.print("Digite o valor do lado oposto: ");
        oposto = ler.nextDouble();
        subtracao = Math.pow(hipotenusa, 2) - Math.pow(oposto, 2);
        adjacente = Math.sqrt(subtracao);

        System.out.println("Valor do lado adjacente: " + adjacente);
    }
}
