import java.util.*;

public class Desenho {
    private List<Forma> formas = new ArrayList<>();
    public void adicionarForma(Forma f) {
        formas.add(f);
    }
    public double calcularAreaTotal() {
        double total = 0;
        for (Forma f : formas) {
            total += f.calcularArea();
        }
        return total;
    }
}