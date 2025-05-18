package com.designpatterns.gof.creational.factory;

/**
 * Implementação concreta de pagamento via cartão de crédito
 */
public class CreditCardPayment implements Payment {
    
    private String cardNumber;
    private String cardHolderName;
    private String expiryDate;
    
    public CreditCardPayment(String cardNumber, String cardHolderName, String expiryDate) {
        this.cardNumber = maskCardNumber(cardNumber);
        this.cardHolderName = cardHolderName;
        this.expiryDate = expiryDate;
    }

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processando pagamento com cartão de crédito no valor de R$" + amount);
        System.out.println("Cartão: " + cardNumber + " | Titular: " + cardHolderName);
        // Simulando lógica de processamento de pagamento
        boolean success = Math.random() > 0.1; // 90% de chance de sucesso
        if (success) {
            System.out.println("Pagamento aprovado!");
        } else {
            System.out.println("Pagamento recusado. Verifique os dados do cartão.");
        }
        return success;
    }

    @Override
    public String getPaymentDetails() {
        return "Pagamento via Cartão de Crédito - Número: " + cardNumber;
    }
    
    /**
     * Máscaras os dígitos do cartão de crédito por segurança
     */
    private String maskCardNumber(String cardNumber) {
        if (cardNumber.length() < 12) {
            return cardNumber;
        }
        // Mantém apenas os últimos 4 dígitos visíveis
        return "**** **** **** " + cardNumber.substring(cardNumber.length() - 4);
    }
}
