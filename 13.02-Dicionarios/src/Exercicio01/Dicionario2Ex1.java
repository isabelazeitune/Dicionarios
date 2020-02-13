package Exercicio01;

import java.util.HashMap;
import java.util.Map;

public class Dicionario2Ex1 {

    Map<String, String> dicionarioEx2 = new HashMap<>();

    public Dicionario2Ex1() {

    }

    public void exibir() {
        System.out.println("Apelidos");
        for (String chave : dicionarioEx2.keySet()) {
            String item = dicionarioEx2.get(chave);
            System.out.println(chave + ": " + item);
            // percorre o mapa nas posições "chave" da menor para a maior, exibindo seus itens chamados "item"
        }
    }

    public void adicionarItensDicionario(String chave, String item) {
        dicionarioEx2.put(chave, item);
    }

    public Map<String, String> getDicionarioEx2() {
        return dicionarioEx2;
    }

    public void setDicionarioEx2(Map<String, String> dicionarioEx2) {
        this.dicionarioEx2 = dicionarioEx2;
    }

    public static void main(String[] args) {
        Dicionario2Ex1 dicionario1 = new Dicionario2Ex1();

        dicionario1.adicionarItensDicionario("João", "Juan, Fissura, Maromba");
        dicionario1.adicionarItensDicionario("Miguel", "Night Watch, Bruce Wayne, Tampinha");
        dicionario1.adicionarItensDicionario("Maria", "Wonder Woman, Mary, Marilene");
        dicionario1.adicionarItensDicionario("Lucas", "Lukinha, Jorge, George");

        dicionario1.exibir();
    }

}