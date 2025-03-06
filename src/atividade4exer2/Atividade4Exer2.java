/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade4exer2;

import java.util.Scanner;

/**
 *
 * @author 7
 */
public class Atividade4Exer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ContaBanacaria conta = new ContaBanacaria();
        System.out.println("Digite o nome do titular da conta:");
        conta.setTitular(ler.next());
        System.out.println("Digite o saldo da conta:");
        conta.setSaldo(ler.nextDouble());
        conta.getSaldo();
        
        int op = 0;
        while(true){
            System.out.println("Informe o que você deseja fazer: \n1.Depositar\n2.Sacar\n3.Mostrar Saldo\n4.Mostrar Rendimentos\n5.Sair");
        op=ler.nextInt();
        if(op==1){
        System.out.println("Digite o valor do depósito:");
            double valorDeposito=ler.nextDouble();
            conta.depositarValor(valorDeposito);
            
        }else if(op==2){
            System.out.println("Qual o valor do saque:");
            double valorSaque=ler.nextDouble();
            conta.sacar(valorSaque);
        }
        else if(op==3){
            System.out.println("Saldo Atual: "+ conta.getSaldo());
        }else if(op==4){
         
            System.out.println(conta.calcularRendimentos(conta.getSaldo()));
    }
        else if(op==5){
            System.out.println("Obrigado por usar o Banco S.A");
        }else{
            System.out.println("Opção inválida!Tente novamente");
        }
    }
    
}
}