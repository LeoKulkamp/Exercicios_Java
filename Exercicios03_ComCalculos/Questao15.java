import java.util.Scanner;

public class Questao15
{
    public static void main(String[] args)
    {
        float altura, peso, IMC;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a sua altura: ");
        altura = ler.nextFloat();
        System.out.println("Digite o seu peso: ");
        peso = ler.nextFloat();
        IMC = peso / (altura * altura);
        System.out.println("Indice de Massa Corporal: " + IMC);
    }
}
