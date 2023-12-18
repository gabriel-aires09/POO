public class Conta {
    private Integer agencia;
    private Integer conta;
    private double saldo;
    
    public Conta(Integer agencia, Integer conta, double saldo) {
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
    }

    public Integer getAgencia() {
        return agencia;
    }

    public Integer getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }

    double saldoBanco = getSaldo();

    public void depositar(double valor){
        saldoBanco += valor;
    }

    public void sacar(double valor){
        if (valor > saldoBanco){
            System.out.println("Saldo insuficiente. Por favor, tente outro valor!");
        }
        double operacao = (saldoBanco * 0.05) - valor;
        System.out.println("Valor sacado: R$" + valor + "\nSaldo atual: R$" + operacao);
    }   
}
