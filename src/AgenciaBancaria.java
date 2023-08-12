import java.util.ArrayList;
import java.util.List;

public class AgenciaBancaria {
    private int numeroAgencia;
    private List<ContaBancaria> contas;

    public AgenciaBancaria(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
        this.contas = new ArrayList<>();
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public void adicionarConta(ContaBancaria conta) {
        contas.add(conta);
    }

    public void realizarDeposito(int numeroConta, double valor) {
        ContaBancaria conta = encontrarConta(numeroConta);
        if (conta != null) {
            conta.depositar(valor);
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    public void realizarSaque(int numeroConta, double valor) {
        ContaBancaria conta = encontrarConta(numeroConta);
        if (conta != null) {
            conta.sacar(valor);
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    private ContaBancaria encontrarConta(int numeroConta) {
        for (ContaBancaria conta : contas) {
            if (conta.getNumeroConta() == numeroConta) {
                return conta;
            }
        }
        return null;
    }
}
