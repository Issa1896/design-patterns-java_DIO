package com.designpatterns.gof.creational.factory;

/**
 * Interface base para o produto do padrão Factory Method.
 * Define o contrato para todos os tipos de pagamento.
 */
public interface Payment {
    
    /**
     * Processa o pagamento.
     * 
     * @param amount Valor a ser pago
     * @return true se o pagamento foi bem-sucedido, false caso contrário
     */
    boolean processPayment(double amount);
    
    /**
     * Obtém uma descrição do método de pagamento.
     * 
     * @return String descritiva do método de pagamento
     */
    String getPaymentDetails();
}
