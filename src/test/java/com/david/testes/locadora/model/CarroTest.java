package com.david.testes.locadora.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    @Test
    @DisplayName("Deve calcular o valor correto do aluguel")
    void deveCalcularValorAluguel() {
        Carro carro = new Carro("Sedan", 100.0);
        double total = carro.calcularValorAluguel(3);
        Assertions.assertEquals(300.0, total);

    }


    @Test
    @DisplayName("Deve calcular o valor correto do aluguel com desconto")
    void deveCalcularValorAluguelComDesconto() {
        Carro carro = new Carro("Sedan", 100.0);
        double total = carro.calcularValorAluguel(5);
        Assertions.assertEquals(450.0, total);

    }

}