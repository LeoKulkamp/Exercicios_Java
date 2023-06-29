import java.util.Scanner;

public class Questao19
{
    public static void main(String[] args)
    {
        int idade, meses, dias;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
        idade = ler.nextInt();
        meses = idade * 12;
        dias = idade * 365;
        System.out.println("Mêses: " + meses + "\nDias: " + dias);

    }
}
