package com.karina.maps;

import com.karina.maps.com.karina.maps.conta.corrente.Ativos;
import com.karina.maps.com.karina.maps.conta.corrente.Saldos;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MapsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MapsApplication.class, args);

		Saldos saldo = new Saldos();
		saldo.lancamentoEntrada();
		saldo.lancamentoSaida(saldo.getGuardaValor());

		Ativos ativos = new Ativos();
	}
}
