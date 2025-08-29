public class CartaoCredito implements Pagamento {
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " no cartão de crédito.");
    }
}