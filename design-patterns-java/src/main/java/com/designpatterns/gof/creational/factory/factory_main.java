package com.designpatterns.gof.creational.factory;

/**
 * Demonstração do padrão Factory Method no sistema de pedidos
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println("Demonstração do padrão Factory Method");
        System.out.println("===================================");
        
        // Criando as fábricas de pagamento
        PaymentFactory creditCardFactory = new CreditCardPaymentFactory(
                "1234567890123456", "João Silva", "12/2025");
        
        PaymentFactory bankSlipFactory = new BankSlipPaymentFactory(
                "Maria Souza", "123.456.789-00", "10/06/2023");
        
        PaymentFactory pixFactory = new PixPaymentFactory(
                "carlos@email.com", "E-mail");
        
        // Valores dos pedidos
        double order1Value = 199.99;
        double order2Value = 1500.00;
        double order3Value = 89.90;
        
        System.out.println("\n1. Processando pagamento com cartão de crédito:");
        processOrder(1001, "Smartphone XYZ", order1Value, creditCardFactory);
        
        System.out.println("\n2. Processando pagamento com boleto bancário:");
        processOrder(1002, "Notebook ABC", order2Value, bankSlipFactory);
        
        System.out.println("\n3. Processando pagamento via PIX:");
        processOrder(1003, "Fones de Ouvido", order3Value, pixFactory);
    }
    
    /**
     * Processa um pedido usando a fábrica de pagamento fornecida
     */
    private static void processOrder(int orderId, String productName, double amount, PaymentFactory paymentFactory) {
        System.out.println("Pedido #" + orderId + ": " + productName + " - R$" + amount);
        
        // Cria o pagamento usando a fábrica (Factory Method pattern)
        Payment payment = paymentFactory.createPayment(amount);
        
        // Exibe os detalhes do pagamento
        System.out.println("Método: " + payment.getPaymentDetails());
        
        // Processa o pagamento
        boolean success = payment.processPayment(amount);
        
        if (success) {
            System.out.println("Status: Pedido confirmado!");
        } else {
            System.out.println("Status: Falha no pagamento. Pedido não confirmado.");
        }
    }
}
