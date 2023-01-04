package br.treinamentoLoiane.exer1.Clientes;


public class ContaBancaria {

   private String nome;
   private String numeroDaConta;
   private double saldo;

    public ContaBancaria(String nome, String id, double saldo) {
        this.nome = nome;
        this.numeroDaConta = id;
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

    public void sacar(double s) {

        this.saldo = this.saldo - s;

        if (saldo <= 0) {
            System.out.println("saldo zerado");
        }
    }

    public void depositar (double d) {
        this.saldo = this.saldo + d;
    }


    @Override
   public String toString() {
        return "cliente : " + getNome() + '\n' + "saldo atual : " + saldo;
    }


}
