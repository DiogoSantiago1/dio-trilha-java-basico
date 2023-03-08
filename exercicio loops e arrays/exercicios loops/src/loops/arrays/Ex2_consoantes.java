package loops.arrays;

import java.util.Scanner;

public class Ex2_consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] cosoantes = new String[6];
        int quantiadeConsoantes = 0;
        int count = 0;
        do {
            System.out.println("letra");
            String letra = scan.next();
            if (! (letra.equalsIgnoreCase("a")|
                letra.equalsIgnoreCase("e")|
                letra.equalsIgnoreCase("i")|
                letra.equalsIgnoreCase("o")|
                letra.equalsIgnoreCase("u")) ){
                    cosoantes [count] = letra;
                    quantiadeConsoantes++;
                }
                count++;

        } while(count < cosoantes.length);
        System.out.print("consoantes: ");
        for (String consoante : cosoantes) {
            if( consoante != null ){
                System.out.print(consoante + " ");}
            }
            System.out.println("\nQuantiade de consoantes: " + quantiadeConsoantes);
            System.out.println("Quantiade de letras: " + cosoantes.length);

    }
}
