package br.treinamentoLoiane.exer1.ClientesAbstratos;

public abstract class ContaBancaria { // esta é a classe mãe das outras duas classes

   private String nome;
   private String numeroDaConta;
   private double saldo;

    public ContaBancaria(String nome, String numeroDaConta, double saldo) {
        this.nome = nome;
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }

    public ContaBancaria () {}

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    @Override
   public String toString() {
        return "cliente : " + getNome() + '\n' + "saldo atual : " + saldo;
    }


}




