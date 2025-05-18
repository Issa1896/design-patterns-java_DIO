package com.designpatterns.gof.creational.abstractfactory;

/**
 * Implementação concreta de documentação internacional
 */
public class InternationalDocumentation implements Documentation {

    @Override
    public String generateDocuments(String orderId) {
        return "Nota fiscal eletrônica, declaração de conteúdo, fatura comercial " + 
               "e certificado de origem gerados para o pedido internacional " + orderId;
    }

    @Override
    public boolean isComplete() {
        return true;
    }

    @Override
    public String getType() {
        return "Documentação Internacional";
    }
}
