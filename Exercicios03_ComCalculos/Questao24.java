import java.util.Scanner;

public class Questao24
{
    public static void main(String[] args)
    {
        int numero, i;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        numero = ler.nextInt();
        for (i = 1; i <=10; i++){
            System.out.println(numero + " x " + i + " = " + numero * i);
        }
    }
}
