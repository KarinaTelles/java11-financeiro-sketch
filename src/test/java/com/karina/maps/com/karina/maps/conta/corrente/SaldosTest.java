package com.karina.maps.com.karina.maps.conta.corrente;

import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@DisplayName("Testa o fluxo de dados do saldo")
class SaldosTest {

    //Testa se o lançamento não é negativo
    @Test
    void lancamentoEntrada() {
        Saldos saldoEntrada = new Saldos();//arrange
        int responseEntrada = saldoEntrada.lancamentoEntrada();//act
        assertThat(responseEntrada).isNotNegative();//assert
        AssertionsForClassTypes.assertThat(responseEntrada).isNotNegative();
        AssertionsForClassTypes.assertThat(responseEntrada).isNotZero();
    }

    @Test
    void lancamentoSaida() {
        Saldos saldoSaida = new Saldos();
        int responseSaida = saldoSaida.getGuardaValor();
        assertThat(responseSaida).isNotNegative();
        assertThat(responseSaida).isNotZero();
    }

    @Test
    void getGuardaValor() {
    }
}