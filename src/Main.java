public class Main {
    public static void main(String[] args) {
        AgenciaBancaria agencia = new AgenciaBancaria(123);

        ContaBancaria conta1 = new ContaBancaria(1, "Adauto Fulano", 1300);
        ContaBancaria conta2 = new ContaBancaria(2, "Cicrano Beltrano", 5000);

        agencia.adicionarConta(conta1);
        agencia.adicionarConta(conta2);

        agencia.realizarDeposito(1, 200);
        agencia.realizarSaque(2, 100);

        System.out.println("Saldo da Conta 1: " + conta1.getSaldo());
        System.out.println("Saldo da Conta 2: " + conta2.getSaldo());
    }
}
