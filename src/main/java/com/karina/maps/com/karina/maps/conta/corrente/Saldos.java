package com.karina.maps.com.karina.maps.conta.corrente;

import io.swagger.models.auth.In;

import java.util.Scanner;
public class Saldos {
    /*A minha entrada é "resposta"*/

    public static int deposito() {
        /*Isso tudo é apenas para os lançamentos*/
        int guardaValor = 0;
        try {
            System.out.println("*****************************************");
            System.out.println("(APENAS VALORES NUMÉRICOS) Entre com o valor do seu 1° lançamento: ");
            Scanner inputValor = new Scanner(System.in);
            int valor = Integer.parseInt(inputValor.nextLine());
            if (valor == 0) {
                System.out.println("Poxa ein, vamos parar de gastar? seu saldo é 0, nada, vazio ):");
            }
            if (valor < 0) {
                System.out.println("Erro: valor inválido!!!");
            } else {
                System.out.println("Seu lançamento tem o valor de R$" + valor + " (esse é o lançamento número: 1)");
                guardaValor = valor;
                System.out.println("Seu saldo total no momento é de: " + guardaValor);
                System.out.println("Entre com a descrição do seu 1° lançamento");
                Scanner inputDescricao = new Scanner(System.in);
                String descricao = inputDescricao.nextLine();
                System.out.println("Descrição: " + descricao);
                System.out.println("*****************************************\n");
                try {
                    for (int i = 2; valor > 0; i++) {
                        System.out.println("(APENAS VALORES NUMÉRICOS) Entre com o valor do seu " + i + "° lançamento");
                        Scanner inputValorDois = new Scanner(System.in);
                        valor = Integer.parseInt(inputValorDois.nextLine());
                        if (valor == 0) {
                            System.out.println("Poxa ein, vamos parar de gastar? seu saldo é 0, nada, vazio ):");
                        }
                        if (valor < 0) {
                            System.out.println("Erro: valor inválido!!!");
                        } else {
                            guardaValor = guardaValor + valor;
                            System.out.println("Seu saldo total no momento é de: R$" + guardaValor);
                            System.out.println("Seu lançamento tem o valor de R$" + valor + " (esse é o lançamento número: " + i + " )");
                            System.out.println("Entre com a descrição do seu " + i + "° lançamento");
                            descricao = inputDescricao.nextLine();
                            System.out.println("*****************************************");
                        }
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Apenas lançamento númerico, nenhum caracter é permitido");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Apenas lançamento númerico, nenhum caracter é permitido");
        }

        return guardaValor;
    }

    boolean pagamento(){
        return true;
    }
}
