import java.util.Scanner;

public class Questao5
{
    public static void main(String[] args)
    {
        int horas;
        float valor, salario;
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o numero de horas diarias: ");
        horas = ler.nextInt();
        System.out.print("Digite o valor da sua  hora de trabalho: ");
        valor = ler.nextFloat();
        salario = horas * valor;
        System.out.println("Salário Diário: " + salario);

    }
}
