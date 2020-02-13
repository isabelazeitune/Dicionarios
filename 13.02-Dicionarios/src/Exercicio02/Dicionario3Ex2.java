package Exercicio02;

import java.util.ArrayList;
import java.util.List;

public class Dicionario3Ex2 {

    List<Integer> dicionarioEx3 = new ArrayList<>();

    public Dicionario3Ex2() {

    }

    public void exibir() {
        System.out.println("Lista:");
        for(Integer valor: dicionarioEx3) {
            System.out.println(valor);
            // percorre a lista nas posições "0" até "valor"
        }
    }

    public void adicionarItensDicionario(Integer algo) {
        dicionarioEx3.add(algo);
    }

    public List<Integer> getDicionarioEx3() {
        return dicionarioEx3;
    }

    public void setDicionarioEx3(List<Integer> dicionarioEx3) {
        this.dicionarioEx3 = dicionarioEx3;
    }

    public static void main(String[] args) {
        Dicionario3Ex2 dicionario1 = new Dicionario3Ex2();

        dicionario1.adicionarItensDicionario(1);
        dicionario1.adicionarItensDicionario(5);
        dicionario1.adicionarItensDicionario(5);
        dicionario1.adicionarItensDicionario(6);
        dicionario1.adicionarItensDicionario(7);
        dicionario1.adicionarItensDicionario(8);
        dicionario1.adicionarItensDicionario(8);
        dicionario1.adicionarItensDicionario(8);

        dicionario1.exibir();
    }

}