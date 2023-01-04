package br.treinamentoLoiane.exer1.caixa;
import br.treinamentoLoiane.exer1.ClientesAbstratos.ContaBancaria;

public  final class Poupanca extends ContaBancaria {

    public Poupanca(String nome, String numeroDaConta, double saldo) {
        super(nome, numeroDaConta, saldo);
    }

    public Poupanca(){}

    public double CALCULARRENDIMENTO(){

        double RENDIMENTO = 0.05; // este metodo faz p calculo de rendimento a partir da polpança do cliente
        double s = super.getSaldo() * RENDIMENTO;
        return s + super.getSaldo();
    }

}




