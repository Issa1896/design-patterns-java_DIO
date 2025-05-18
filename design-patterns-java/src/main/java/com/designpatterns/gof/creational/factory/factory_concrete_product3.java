package com.designpatterns.gof.creational.factory;

/**
 * Implementação concreta de pagamento via PIX
 */
public class PixPayment implements Payment {
    
    private String pixKey;
    private String pixKeyType;
    
    public PixPayment(String pixKey, String pixKeyType) {
        this.pixKey = pixKey;
        this.pixKeyType = pixKeyType;
    }

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processando pagamento via PIX no valor de R$" + amount);
        System.out.println("Chave PIX: " + pixKey + " | Tipo: " + pixKeyType);
        
        // Simulando ID de transação
        String transactionId = generateTransactionId();
        System.out.println("ID da transação: " + transactionId);
        
        System.out.println("Pagamento PIX processado com sucesso!");
        return true;
    }

    @Override
    public String getPaymentDetails() {
        return "Pagamento via PIX - Tipo de chave: " + pixKeyType;
    }
    
    /**
     * Gera um ID de transação fictício para o PIX
     */
    private String generateTransactionId() {
        StringBuilder id = new StringBuilder();
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        for (int i = 0; i < 32; i++) {
            id.append(chars.charAt((int) (Math.random() * chars.length())));
        }
        return id.toString();
    }
}
