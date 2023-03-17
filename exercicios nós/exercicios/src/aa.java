import java.util.Scanner;

public class aa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int custoFabrica;
        int porcentagemDistribuidor;
        int PercentualImpostos;
       
        System.out.println("Custo de fabrica: ");
        custoFabrica = scan.nextInt();
       
        System.out.println("Porcenteagem do distribuidor: ");
        porcentagemDistribuidor = scan.nextInt();

        System.out.println("percentual dos impostos: ");
        PercentualImpostos = scan.nextInt();
        
        
            int custoConsumidor;
            int Distribuidor;
            int ValorImpostos;

            Distribuidor = (custoFabrica * porcentagemDistribuidor) / 100;
            ValorImpostos = (custoFabrica * PercentualImpostos) / 100;
            custoConsumidor = (custoFabrica + Distribuidor + ValorImpostos);

        System.out.println("Custo total do carro:" + custoConsumidor);

    }
}