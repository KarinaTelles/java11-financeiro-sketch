package com.karina.maps.com.karina.maps.conta.corrente;

import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@DisplayName("Testa o fluxo de dados do saldo")
class SaldosTest {

    private String string;

    //Testa se o lançamento não é negativo
    @Test
    void lancamentoPositvo() {
        Saldos saldos = new Saldos();
        int response = saldos.getGuardaValor();
        assertThat(response).isNotNegative();
    }
    
}