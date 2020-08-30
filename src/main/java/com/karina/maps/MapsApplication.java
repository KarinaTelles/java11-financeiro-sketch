package com.karina.maps;

import com.karina.maps.com.karina.maps.conta.corrente.Saldos;
import com.karina.maps.config.models.Saldo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MapsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MapsApplication.class, args);
		Saldos saldos = new Saldos();
		saldos.deposito();
	}
}
