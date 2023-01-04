package br.treinamentoLoiane.exer1;
import br.treinamentoLoiane.exer1.caixa.poupanca;
import br.treinamentoLoiane.exer1.caixa.Especial;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String test1;
        Scanner texto = new Scanner(System.in);


        Especial VitorE = new Especial();
        poupanca vitor = new poupanca("vitor","000",200);

      // Vitor.depositar(1);
       // Vitor.setNome("vitor");

       //System.out.println(Vitor.CALCULARRENDIMENTO(Vitor.getSaldo()));


        VitorE.setSaldo(1000);

       // System.out.println(VitorE.sacar(1400));


        vitor.setSaldo(vitor.CALCULARRENDIMENTO());

        System.out.println(vitor.getSaldo());





       // Vitor.rendimentos();
      //  System.out.println(Vitor.toString());










    }
}


