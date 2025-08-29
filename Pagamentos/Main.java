public class Main {
    public static void main(String[] args) {
        Pagamento p1 = new CartaoCredito();
        Pagamento p2 = new Pix();
        Pagamento p3 = new Dinheiro();

        p1.pagar(80);
        p2.pagar(90);
        p3.pagar(100);
    }
}