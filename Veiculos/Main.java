import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(new Carro());
        veiculos.add(new Moto());
        veiculos.add(new Bicicleta());

        for (Veiculo v : veiculos) {
            v.ligarMotor();
            v.acelerar();
            v.frear();
            System.out.println("__________");
        }
    }
}