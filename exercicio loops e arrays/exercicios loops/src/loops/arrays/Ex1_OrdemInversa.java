package loops.arrays;

public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        
        int[] vetor = { -5, -6, 16, 4, 7, 9};
        int count =0;
        System.out.print("vetor: ");
        while(count <= (vetor.length-1)) {

            System.out.print(vetor[count] + " ");
            count++;
        }
        System.out.print("\nvetor: ");
        for( int i = (vetor.length - 1 ); i >= 0; i--) {
            System.out.print(vetor[i] + " ");

        }


    }
}
