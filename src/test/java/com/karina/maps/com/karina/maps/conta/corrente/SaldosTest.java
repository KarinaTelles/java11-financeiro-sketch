package com.karina.maps.com.karina.maps.conta.corrente;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@DisplayName("Testa o fluxo de dados do saldo")
class SaldosTest {

    //Testa se o lançamento não é negativo
    @Test
    void lancamentoEntrada() {
        Saldos saldos = new Saldos();//arrange
        int response = saldos.lancamentoEntrada();//act
        assertThat(response).isNotNegative();
    }


    @Test
    void lancamentoSaida() {
    }

    @Test
    void getGuardaValor() {
    }
}