package br.treinamentoLoiane.exer1.caixa;
import br.treinamentoLoiane.exer1.ClientesAbstratos.ContaBancaria;


public final class Especial extends ContaBancaria {

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

    public double sacar(double s) { // reescrevi o metodo sacar cpm limite assim como pedido no exercicio

        super.setSaldo(super.getSaldo() - s);

        if (super.getSaldo() < 0) {

            setLimiete(getLimiete() + super.getSaldo());

            if (this.limiete < 0) {

                System.out.print("limite maximo atingido");

            } else { // este metodo adiciona um limite de credito para o cliente poder usar

                System.out.println("\nlimite disponivel : " + getLimiete());
                System.out.print("limite usado : ");
                return super.getSaldo();

            }

        }

        System.out.print("\nsaldo disponivel : ");
        return super.getSaldo();


    }


}
