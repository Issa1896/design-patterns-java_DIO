package com.designpatterns.gof.creational.abstractfactory;

/**
 * Implementação concreta de documentação padrão
 */
public class StandardDocumentation implements Documentation {

    @Override
    public String generateDocuments(String orderId) {
        return "Nota fiscal eletrônica gerada para o pedido " + orderId;
    }

    @Override
    public boolean isComplete() {
        return true;
    }

    @Override
    public String getType() {
        return "Documentação Padrão";
    }
}
