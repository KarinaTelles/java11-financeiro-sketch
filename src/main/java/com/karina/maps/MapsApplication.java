package com.karina.maps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class MapsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MapsApplication.class, args);
        System.out.println("*****************************************");
		System.out.println("Entre com o valor do seu 1° lançamento: ");
		Scanner inputValor = new Scanner(System.in);
		int valor = Integer.parseInt(inputValor.nextLine());
        if (valor < 1) {
            System.out.println("Erro: valor inválida!!!");
        }
        else{
            System.out.println("Seu lançamento tem o valor de R$" + valor + " (esse é o print 1)");
            System.out.println("Entre com a descrição do seu 1° lançamento");
            Scanner inputDescricao = new Scanner(System.in);
            String descricao = inputDescricao.nextLine();
            System.out.println(descricao);
            System.out.println("*****************************************\n");
            for (int i = 2; valor > 0; i++){
                System.out.println("Entre com o valor do seu " + i + "° lançamento");
                Scanner inputValorDois = new Scanner(System.in);
                valor = Integer.parseInt(inputValorDois.nextLine());
                if (valor < 1) {
                    System.out.println("Erro: valor inválid0!!!");
                }
                else{
                    System.out.println("Seu lançamento tem o valor de R$" + valor + " (esse é o print " + i + " )" );
                    System.out.println("Entre com a descrição do seu "+i+ "° lançamento");
                    descricao = inputDescricao.nextLine();
                    System.out.println("*****************************************");
                }
            }
        }

	}
}
