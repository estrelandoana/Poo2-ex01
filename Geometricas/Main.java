import java.util.*;

public class Main {
    public static void main(String[] args) {
        Desenho desenho = new Desenho();
        desenho.adicionarForma(new Quadrado(4));
        desenho.adicionarForma(new Circulo(3));

        System.out.println("Área total = " + desenho.calcularAreaTotal());
    }
}