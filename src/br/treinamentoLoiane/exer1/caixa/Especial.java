package br.treinamentoLoiane.exer1.caixa;
import br.treinamentoLoiane.exer1.ClientesAbstratos.ContaBancaria;
import br.treinamentoLoiane.exer1.ClientesAbstratos.Operacoes;


public final class Especial extends ContaBancaria implements Operacoes {

    private double limiete ;

    public Especial(String nome, String numeroDaConta, double saldo, double limiete) {
        super(nome, numeroDaConta, saldo);
        this.limiete = limiete;
    }

    public double getLimiete() {
        return limiete;
    }

    public void setLimiete(double limiete) {
        this.limiete = limiete;
    }


    @Override
    public double sacar(double s) {


        super.setSaldo(super.getSaldo() - s);

        if (super.getSaldo() < 0) {

            setLimiete(getLimiete() + super.getSaldo());

            if (this.limiete < 0) {

                System.out.print("limite maximo atingido");

            } else { // este metodo adiciona um limite de credito para o cliente poder usar

                System.out.print("\nlimite disponivel : " + getLimiete());
                System.out.print("limite usado : ");
                return super.getSaldo();

            }

        }

        System.out.print("\nsaldo disponivel : ");
        return super.getSaldo();
    }

    @Override
    public void depositar(double d) {
        super.setSaldo(getSaldo() + d);
    }
}
