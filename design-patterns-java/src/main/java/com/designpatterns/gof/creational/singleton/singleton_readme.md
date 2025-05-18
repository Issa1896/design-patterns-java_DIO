# Padrão Singleton

## Descrição
O padrão Singleton garante que uma classe tenha apenas uma instância e fornece um ponto global de acesso a ela. É útil quando precisamos ter exatamente uma instância compartilhada por toda a aplicação.

## Quando Usar
- Quando precisamos garantir que uma classe tenha apenas uma instância (como conexões de banco de dados, pools, caches)
- Quando essa instância única deve ser acessível por vários componentes do sistema
- Quando a instância única deve ser extensível por meio de subclasses

## Aplicação no Sistema de Pedidos
No nosso sistema, usamos o Singleton para gerenciar o registro de pedidos, garantindo que todos os componentes do sistema interajam com a mesma instância do registro.
