import java.util.Scanner;

public class Questao1
{
    public static void main(String[] args)
    {
        int Num1, Num2, soma;
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        Num1 = ler.nextInt();
        System.out.print("Digite o segundo numero: ");
        Num2 = ler.nextInt();
        soma = Num1 + Num2;
        System.out.println("Soma: " + soma);
    }
}
