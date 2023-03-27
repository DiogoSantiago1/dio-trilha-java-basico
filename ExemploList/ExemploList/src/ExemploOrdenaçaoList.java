import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExemploOrdenaçaoList {
    public static void main(String[] args) {
        List<Gato> meuGatos =  new ArrayList<>(){{
            add(new Gato("Diogo", 18, "Preta"));
            add(new Gato("Lima", 17, "Pretaaoo"));
            add(new Gato("Santiago", 16, "Pretasooo"));
        }};
        System.out.println("--\t ordem de Iserção \t");
        System.out.println(meuGatos);
        System.out.println("--\t Ordem aleatoria \t");
        Collections.shuffle(meuGatos);
        System.out.println(meuGatos);
        Map<String, Double> carrMap = new HashMap<>();
    }
}

class Gato{
    private String nome;
    private Integer idade;
    private String cor;
    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }
    public String getNome() {
        return nome;
    }
    public Integer getIdade() {
        return idade;
    }
    public String getCor() {
        return cor;
    }
    @Override
    public String toString() {
        return "gato [nome=" + nome + ", idade=" + idade + ", cor=" + cor + "]";
    }
}