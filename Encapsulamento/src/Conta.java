

public class Conta {
    Integer numero_de_conta;
    String titular;
    private double saldo = 100.0f; // modificador de acesso = private double

    public boolean sacar(Float valor){
        if (valor <= 0) {
            System.out.println("Valor indisponivel");
            return false;
        }

        if (saldo >= valor){
            System.out.println("Saque efetuado com sucesso!");
            saldo -= valor;
            return true;
        }
        else{
            System.out.println("Saldo insuficiente");
            return false;
        }
    }

    public double getSaldo() {
        return saldo;
    }

}
