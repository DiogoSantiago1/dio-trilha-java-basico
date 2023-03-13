public class Main {
    public static void main(String[] args) {
        
        No no1 = new No("conteudo nó 1");
        No no2 = new No("Conteudo Nó 2");
        no1.setProximoNo(no2);

        No no3 = new No("conteudo nó 3");
        no2.setProximoNo(no3);

        No no4 = new No("conteudo nó 4");
        no3.setProximoNo(no4);

        //no1->no2->NO3->NO4->null
        System.out.println(no1);
    }
}
