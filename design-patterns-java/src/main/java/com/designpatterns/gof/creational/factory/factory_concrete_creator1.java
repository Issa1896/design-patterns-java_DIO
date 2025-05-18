package com.designpatterns.gof.creational.factory;

/**
 * Implementação concreta da fábrica para pagamentos com cartão de crédito
 */
public class CreditCardPaymentFactory implements PaymentFactory {
    
    private String cardNumber;
    private String cardHolderName;
    private String expiryDate;
    
    public CreditCardPaymentFactory(String cardNumber, String cardHolderName, String expiryDate) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expiryDate = expiryDate;
    }

    @Override
    public Payment createPayment(double amount) {
        return new CreditCardPayment(cardNumber, cardHolderName, expiryDate);
    }
}
