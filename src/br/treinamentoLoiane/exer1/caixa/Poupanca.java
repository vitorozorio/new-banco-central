package br.treinamentoLoiane.exer1.caixa;
import br.treinamentoLoiane.exer1.ClientesAbstratos.ContaBancaria;

public  final class poupanca extends ContaBancaria {

    public poupanca(String nome, String id, double saldo) {
        super(nome, id, saldo);
    }

    public double CALCULARRENDIMENTO(){

        double RENDIMENTO = 0.05;
        double s = super.getSaldo() * RENDIMENTO;
        return s + super.getSaldo();
    }

}




