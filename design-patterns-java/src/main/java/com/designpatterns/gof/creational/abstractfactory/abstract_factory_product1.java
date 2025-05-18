package com.designpatterns.gof.creational.abstractfactory;

/**
 * Interface para o produto abstrato Button.
 * Define o comportamento comum para todos os botões, independente do tema.
 */
public interface Button {
    
    /**
     * Renderiza o botão na interface do usuário
     * 
     * @param label Texto a ser exibido no botão
     */
    void render(String label);
    
    /**
     * Processa o clique no botão
     */
    void onClick();
}
