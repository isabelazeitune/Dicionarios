package Exercicio01;

import java.util.HashMap;
import java.util.Map;

public class Dicionario1Ex1 {

    Map<Integer, String> dicionarioEx1 = new HashMap<>();

    public Dicionario1Ex1() {

    }

    public void exibir() {
        System.out.println("Dicionário");
        for (Integer chave : dicionarioEx1.keySet()) {
            String item = dicionarioEx1.get(chave);
            System.out.println(chave + ": " + item);
            // percorre o mapa nas posições "chave" da menor para a maior, exibindo seus itens chamados "item"
        }
    }

    public void adicionarItensDicionario(Integer chave, String item) {
        dicionarioEx1.put(chave, item);
    }

    public Map<Integer, String> getDicionarioEx1() {
        return dicionarioEx1;
    }

    public void setDicionarioEx1(Map<Integer, String> dicionarioEx1) {
        this.dicionarioEx1 = dicionarioEx1;
    }

    public static void main(String[] args) {
        Dicionario1Ex1 dicionario1 = new Dicionario1Ex1();

        dicionario1.adicionarItensDicionario(0, "Ovos");
        dicionario1.adicionarItensDicionario(1, "Água");
        dicionario1.adicionarItensDicionario(2, "Escopeta");
        dicionario1.adicionarItensDicionario(3, "Cavalo");
        dicionario1.adicionarItensDicionario(4, "Dentista");
        dicionario1.adicionarItensDicionario(5, "Fogo");

        dicionario1.exibir();
    }

}