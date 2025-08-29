public class Bicicleta implements Veiculo {
    public void acelerar() {
        System.out.println("Bicicleta acelerando!");
    }
    public void frear() {
        System.out.println("Bicicleta freando!");
    }
    @Override
    public void ligarMotor() {
        System.out.println("Bicicleta não tem motor!");
    }
}