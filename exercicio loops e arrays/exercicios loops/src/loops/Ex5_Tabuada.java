package loops;
import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int numeroDaTabuada;
       int numeroMultipilcado;
       int count = 0;
       System.out.println("Tabuada do:");
       numeroDaTabuada = scan.nextInt();
       System.out.println("Tabuada de " + numeroDaTabuada);
        do {
            count = count + 1;

            System.out.println( numeroDaTabuada + " x " + count + " = " + numeroDaTabuada * count);
        } while( count < 10 );

    }
}
