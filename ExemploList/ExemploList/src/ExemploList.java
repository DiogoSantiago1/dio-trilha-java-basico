import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ExemploList {
    public static void main(final String[] args) {
       final ArrayList<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
       notas.add(10d);
       System.out.println(notas);
       notas.set(notas.indexOf(7d), 6.0);
       System.out.println(notas);
       System.out.println("menor num " + Collections.min(notas));
       System.out.println("MAIOR NUM" + Collections.max(notas));
       Iterator<Double> iterator = notas.iterator();
       Double soma = 0d;
       while(iterator.hasNext()){
        Double next = iterator.next();
        soma += next;
        System.out.println(soma);
       }
    }

  
}
