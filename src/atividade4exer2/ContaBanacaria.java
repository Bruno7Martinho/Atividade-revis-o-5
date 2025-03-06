/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade4exer2;

/**
 *
 * @author 7
 */
public class ContaBanacaria {
    private String titular;
    private double saldo;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void depositarValor(double valorDeposito){
       if(saldo>0) {
        saldo +=valorDeposito;
        System.out.println("R$ "+valorDeposito+" depositado com sucesso!!!");}
       else{
           System.out.println("Valor inválido para depósito!!!");
       }
        
       
    }
    public void sacar(double valorSaque){
        if(valorSaque<0 && valorSaque>=saldo){
            System.out.println("O saque não pode ser realizado(Valor ultrapassa saldo)");
        }else{
            saldo -=valorSaque;
            System.out.println("R$ "+ valorSaque +" sacado com sucesso!!!");
        }
    }
    public double calcularRendimentos(double rendimentos){
       rendimentos = getSaldo()*0.12;
      
      System.out.println("Rendimento de R$ " + rendimentos + " aplicado.");
    }
    
    public void mostrarSaldo(){
        System.out.println(getSaldo());
    }
}
