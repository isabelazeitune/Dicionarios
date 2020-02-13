package Exercicio02;

import java.util.HashSet;
import java.util.Set;

public class Dicionario4Ex2 {

    Set<Integer> dicionarioEx4 = new HashSet<>();

    public Dicionario4Ex2() {

    }

    public void exibir() {
        System.out.println("Conjunto");
        for(Integer valor: dicionarioEx4) {
            System.out.println(valor);
            // percorre o conjunto nas posições "0" até "valor"
        }
    }

    public void adicionarItensDicionario(Integer algo) {
        dicionarioEx4.add(algo);
    }

    public Set<Integer> getDicionarioEx4() {
        return dicionarioEx4;
    }

    public void setDicionarioEx4(Set<Integer> dicionarioEx4) {
        this.dicionarioEx4 = dicionarioEx4;
    }

    public static void main(String[] args) {
        Dicionario4Ex2 dicionario1 = new Dicionario4Ex2();

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
