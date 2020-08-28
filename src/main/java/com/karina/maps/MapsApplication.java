package com.karina.maps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class MapsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MapsApplication.class, args);
		/*A minha entrada é "resposta"*/
		System.out.println("Entre com um valor");
		Scanner input = new Scanner(System.in);
		int resposta = Integer.parseInt(input.nextLine());
		while (resposta > 0){
			System.out.println("Entre com um valor");
			Scanner inputTwo = new Scanner((System.in));
			resposta = Integer.parseInt((input.nextLine()));
		}
		if(resposta < 1){
			System.out.println("Entrada inválida!!!");
		}
	}

}
