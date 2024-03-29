package com.karina.maps.com.karina.maps.conta.corrente;

import java.util.Scanner;
public class Saldos {
    private String id;

    private int guardaValor = 0;

    public int lancamentoEntrada(){
        try {
            System.out.println("*****************************************");
            System.out.println("(APENAS VALORES NUMÉRICOS) Entre com o valor do seu 1° lançamento: ");
            Scanner inputValor = new Scanner(System.in);
            int valor = Integer.parseInt(inputValor.nextLine());
            if (valor <= 0) {
                System.out.println("Erro: Lançamentos apenas maiores que 0");
                System.out.println("Saldo: "+ guardaValor);
            }else {
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
                        if (valor <= 0) {
                            System.out.println("Erro: Lançamentos apenas maiores que 0");
                            System.out.println("Saldo: "+ guardaValor);
                        }else {
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
                    System.out.println("Saldo: "+ guardaValor);
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Apenas lançamento númerico, nenhum caracter é permitido");
            System.out.println("Saldo: "+ guardaValor);
        }
        System.out.println("Ultimo valor: " + guardaValor);
        return guardaValor;
    }
    public int lancamentoSaida(int guardaValor){
        this.guardaValor = guardaValor;
        try {
            System.out.println("*****************************************");
            System.out.println("(APENAS VALORES NUMÉRICOS) Entre com o sua  1° retirada: ");
            Scanner inputValor = new Scanner(System.in);
            int valor = Integer.parseInt(inputValor.nextLine());
            if(guardaValor<=0){
                System.out.println("Erro: Seu saldo não pode ser negativo, por favor, informe outro valor");
            }
            if (valor<=0) {
                System.out.println("Erro: Retire um valor maior que 0 (zero)");
                System.out.println("Saldo: "+ guardaValor);
            }else {
                System.out.println("Sua retirada tem o valor de R$" + valor + " (essa é o retirada número 1)");
                guardaValor = guardaValor - valor;
                System.out.println("Seu saldo total no momento é de: " + guardaValor);
                System.out.println("Entre com a descrição da sua 1° retirada");
                Scanner inputDescricao = new Scanner(System.in);
                String descricao = inputDescricao.nextLine();
                System.out.println("Descrição: " + descricao);
                System.out.println("*****************************************\n");
                try {
                    for (int i = 2; valor > 0; i++) {
                        System.out.println("(APENAS VALORES NUMÉRICOS) Entre com o sua " + i + "° retirada");
                        Scanner inputValorDois = new Scanner(System.in);
                        valor = Integer.parseInt(inputValorDois.nextLine());
                        if (guardaValor<=0){
                            System.out.println("Erro: Seu saldo não pode ser negativo, por favor, informe outro valor");
                        }
                        if (valor<= 0) {
                            System.out.println("Erro: Retire um valor maior que 0 (zero)");
                            System.out.println("Saldo: "+ guardaValor);
                        }else {
                            guardaValor = guardaValor - valor;
                            System.out.println("Seu saldo total no momento é de: R$" + guardaValor);
                            System.out.println("Sua retirada tem o valor de R$" + valor + " (essa éa retirada número: " + i + " )");
                            System.out.println("Entre com a descrição da sua " + i + "° retirada");
                            descricao = inputDescricao.nextLine();
                            System.out.println("*****************************************");
                        }
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Apenas retiradas númerica, nenhum caracter é permitido");
                    System.out.println("Saldo: "+ guardaValor);
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Apenas retiradas númerica, nenhum caracter é permitido");
            System.out.println("Saldo: "+ guardaValor);
        }
        System.out.println("Ultimo valor: " + guardaValor);
        return guardaValor;
    }
    public int getGuardaValor() {
        return guardaValor;
    }

}
