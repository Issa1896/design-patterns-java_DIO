package com.designpatterns.gof.creational.factory;

/**
 * Interface Criadora para o Factory Method.
 * Define o método de fábrica que retorna um objeto Payment.
 */
public interface PaymentFactory {
    
    /**
     * Método de fábrica que cria e retorna um objeto de pagamento.
     * 
     * @param amount Valor a ser pago
     * @return Objeto Payment configurado para o valor fornecido
     */
    Payment createPayment(double amount);
}
