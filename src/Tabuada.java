import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int multiplicando = 0;
        int multiplicadorMin = 0;
        int multiplicadorMax = 0;

        System.out.println(retornarTabuada(multiplicando, multiplicadorMin,multiplicadorMax));

    }

    public static int  retornarTabuada(int multiplicando, int multiplicadorMin, int multiplicadorMax){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Qual é o multiplicando? ");
        multiplicando = leitor.nextInt();
        System.out.println("Qual é o multiplicador mínimo? ");
        multiplicadorMin = leitor.nextInt();
        System.out.println("Qual é o multiplicador máximo? ");
        multiplicadorMax = leitor.nextInt();

        int resultado = 0;

        System.out.println("Tabuada do : " + multiplicando);
        System.out.println("-------------------------------");

        while (multiplicadorMin <= multiplicadorMax ){
            resultado = multiplicando * multiplicadorMin;
            System.out.println(multiplicando + "X" + multiplicadorMin + " = " + resultado);
            multiplicadorMin ++;

        }
        System.out.println("-------------------------------");

        return multiplicando;

    }

}
