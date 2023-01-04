package br.treinamentoLoiane.exer1;
import br.treinamentoLoiane.exer1.caixa.Poupanca;
import br.treinamentoLoiane.exer1.caixa.Especial;
import java.util.Objects;

import java.util.Scanner;

public class TesteContaBancaria {
    public static void main(String[] args) {

        Scanner texto = new Scanner(System.in);
        String numConta,nome;
        double deposito, saque;
        boolean verificadora = true;
        int opcao;

        Poupanca P0 = new Poupanca();
        Poupanca P1 = new Poupanca("vitor","2002",10);
        Especial E1 = new Especial("edson","2001",100,700);

        do {

            System.out.print("escolha uma opção \n1 para cadastrar nova conta \n2 para entrar em uma conta existente\n");
            opcao = texto.nextInt();

              switch (opcao) {

                  case  1 -> {

                      System.out.println("insira seus dados");

                      System.out.print("nome :");
                      nome = texto.next();

                      System.out.print("numero da conta :");
                      numConta = texto.next();

                      System.out.print("agora faça um deposito de algum valor :");
                      deposito = texto.nextDouble();

                      P0.setNome(nome);
                      P0.setNumeroDaConta(numConta);
                      P0.depositar(deposito);

                      System.out.print("\n"+ P0);

                  }

                  case 2 -> {

                      System.out.print("insira o numero da conta :");
                      numConta = texto.next();

                      if (Objects.equals(numConta, P1.getNumeroDaConta())) {

                          System.out.println(P1);
                          System.out.println("\ndeseja realizar uma operação ?");
                          System.out.println("1 para saque\n2 para deposito\n3 para sair");
                          opcao = texto.nextInt();

                          switch (opcao) {

                              case 1 ->{
                                 System.out.print("insira o valor do saque :");
                                 saque = texto.nextDouble();
                                 System.out.println(P1.sacar(saque));
                              }

                              case 2 -> {
                                  System.out.print("insira o valor do deposito :");
                                  deposito = texto.nextDouble();
                                  P1.setSaldo(deposito);
                                  P1.setSaldo(P1.CALCULARRENDIMENTO());
                                  System.out.println("saldo com rendimento de 0,005 % : " + P1.getSaldo());

                              }

                              case 3 -> verificadora = false;

                          }

                      } else if (Objects.equals(numConta, E1.getNumeroDaConta())) {

                          System.out.println(E1);
                          System.out.println("\ndeseja realizar uma operação ?");
                          System.out.println("1 para saque\n2 para deposito\n3 para sair");
                          opcao = texto.nextInt();

                          switch (opcao) {

                              case 1 ->{
                                  System.out.print("insira o valor do saque :");
                                  saque = texto.nextDouble();
                                  System.out.println(E1.sacar(saque));
                              }

                              case 2 -> {
                                  System.out.print("insira o valor do deposito :");
                                  deposito = texto.nextDouble();
                                  E1.setSaldo(deposito);
                                  System.out.println("saldo atual :" + E1.getSaldo());
                              }

                              case 3 -> verificadora = false;

                          }

                      }
                      else {

                          System.out.println("\n\nconta inesistente !!!");

                      }

                  }

              }

              System.out.println("\n\ndigite 1 para sair ou 2 para uma nova operação");
              opcao = texto.nextInt();

                 if (opcao == 1) {
                   verificadora = false;
                 }
                 if (opcao == 2) {
                     verificadora = true;
                 }

        } while (verificadora);

    }
}


