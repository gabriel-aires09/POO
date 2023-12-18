public class ContaEspecial extends Conta {
    public ContaEspecial(Integer agencia, Integer conta, double saldo) {
        super(agencia, conta, saldo);
    }

    public void sacarContaEspecial(double valor) {
        if (valor > saldoBanco){
            System.out.println("Saldo insuficiente. Por favor, tente outro valor!");
        }
        double operacao = (saldoBanco * 0.01) - valor;
        System.out.println("Valor sacado: R$" + valor + "\nSaldo atual: R$" + operacao);
    } 
}
