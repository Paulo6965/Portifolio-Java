import java.util.ArrayList;
import java.util.List;

class Conta {
    private String titular;
    protected double saldo;

    public Conta(String titular, double saldoInicial){
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor){
        if (valor > 0){
            this.saldo +=valor;
        System.out.println("Deposito de R$" +valor+ " para " +titular);
        }
    }
    public void sacar(double valor){
        if (valor <= saldo) {
            this.saldo -= valor;
            System.out.println("Saque de R$" +valor+ " realizado por " +titular);
        }else{
            System.out.println("Saldo insuficiente para " +titular);
        }
    }

    public double getSaldo(){
        return this.saldo;
    }

    public String getTitular(){
        return titular;
    }
}

class ContaPoupanca extends Conta{
    private double rendimento = 0.05;
    public ContaPoupanca(String titular, double saldoInicial) {
        super(titular,saldoInicial);
    }
    public void aplicarRendimento() {
        this.saldo += (this.saldo * rendimento);
        System.out.println("Rendimento aplicado! Novo saldo: R$" +this.saldo);
    }
} 

class ContaEmpresarial extends Conta {
    public ContaEmpresarial(String titular, double saldoInicial){
        super(titular,saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        double taxa = 10.0;
        if (valor + taxa <= saldo) {
            this.saldo -= (valor + taxa);
            System.out.println("Saque empresarial: R$" +valor+ " (Taxa: R$10). Titular:" +getTitular());    
        }else {
            System.out.println("Saldo insuficiente para saque empresarial.");
        }
    }
}

public class Principal {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA BANCARIO OO ===\n");
        Conta contaNormal = new Conta("José Silva", 500.0);
        ContaPoupanca poupanca = new ContaPoupanca("Maria Oliveira", 1000.0);
        ContaEmpresarial empresa = new ContaEmpresarial("Tech Solutions", 5000.0);

        contaNormal.sacar(100.0);

        poupanca.depositar(200.0);
        poupanca.aplicarRendimento();

        empresa.sacar(1000.0);

        System.out.println("\n--- Resumo de Saldos ---");
        System.out.println("Titular: " +contaNormal.getTitular()+ "| Saldo: R$" +contaNormal.getSaldo());
        System.out.println("Titular: " +poupanca.getTitular()+ "| Saldo: R$" + poupanca.getSaldo());
        System.out.println("Titular: " +empresa.getTitular()+ " | Saldo: R$" +empresa.getSaldo());
    }
}