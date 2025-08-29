import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Animais> animais = new ArrayList<>();
        animais.add(new Cachorro());
        animais.add(new Gato());

        for (Animais a : animais) {
            a.emitirSom();
        }
    }
}