public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("exercicio calculadora");
        Calculadora.soma(67, 8);
        Calculadora.subitracao(5, 8);
        Calculadora.multiplicacao(3, 5);
        Calculadora.divisao(9, 90);

        //hora
        System.out.println("Exercicio Hora:");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(22);
        Mensagem.obterMensagem(13);
    }
}
