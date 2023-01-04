package br.treinamentoLoiane.exer1.caixa;
import br.treinamentoLoiane.exer1.ClientesAbstratos.ContaBancaria;
import br.treinamentoLoiane.exer1.ClientesAbstratos.Operacoes;

public final class Poupanca extends ContaBancaria implements Operacoes  {

    public Poupanca(String nome, String numeroDaConta, double saldo) {
        super(nome, numeroDaConta, saldo);
    }

    public Poupanca(){}

    public double CALCULARRENDIMENTO(){

        double RENDIMENTO = 0.05; // este metodo faz o calculo de rendimento a partir da poupança do cliente
        double s = super.getSaldo() * RENDIMENTO;
        return s + super.getSaldo();
    }


    @Override
    public double sacar(double s) {
        super.setSaldo(getSaldo() - s);
        return getSaldo();
    }

    @Override
    public void depositar(double d) {
        super.setSaldo(CALCULARRENDIMENTO());
        System.out.println("saldo com rendimentos :" + super.getSaldo());
    }
}




