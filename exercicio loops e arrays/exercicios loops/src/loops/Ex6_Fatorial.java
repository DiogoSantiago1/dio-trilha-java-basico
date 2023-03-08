package loops;
import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(" Fatorial:");
        int Fatorial = scan.nextInt();
        int multiplicacao = 1;

        for ( int i = Fatorial ; i >= 1; i-- ) {
            multiplicacao = multiplicacao * i;
    
        }
        System.out.println( Fatorial +"! =" + multiplicacao);
    }
}
