# Design Patterns com Java: Dos Clássicos (GoF) ao Spring Framework

Este projeto educacional demonstra a implementação de padrões de projeto (Design Patterns) em Java, incluindo os padrões GoF (Gang of Four) e sua aplicação no Spring Framework. O projeto é voltado para desenvolvedores com nível intermediário em Java e serve tanto como guia de estudo quanto como base reutilizável em aplicações reais.

## Índice dos Padrões

### Padrões de Criação
- [Singleton](src/main/java/com/designpatterns/gof/creational/singleton/README.md)
- [Factory Method](src/main/java/com/designpatterns/gof/creational/factory/README.md)
- [Abstract Factory](src/main/java/com/designpatterns/gof/creational/abstractfactory/README.md)
- [Builder](src/main/java/com/designpatterns/gof/creational/builder/README.md)
- [Prototype](src/main/java/com/designpatterns/gof/creational/prototype/README.md)

### Padrões Estruturais
- [Adapter](src/main/java/com/designpatterns/gof/structural/adapter/README.md)
- [Composite](src/main/java/com/designpatterns/gof/structural/composite/README.md)
- [Decorator](src/main/java/com/designpatterns/gof/structural/decorator/README.md)
- [Facade](src/main/java/com/designpatterns/gof/structural/facade/README.md)
- [Proxy](src/main/java/com/designpatterns/gof/structural/proxy/README.md)

### Padrões Comportamentais
- [Chain of Responsibility](src/main/java/com/designpatterns/gof/behavioral/chain/README.md)
- [Command](src/main/java/com/designpatterns/gof/behavioral/command/README.md)
- [Strategy](src/main/java/com/designpatterns/gof/behavioral/strategy/README.md)
- [Observer](src/main/java/com/designpatterns/gof/behavioral/observer/README.md)
- [Template Method](src/main/java/com/designpatterns/gof/behavioral/template/README.md)
- [State](src/main/java/com/designpatterns/gof/behavioral/state/README.md)

### Implementações no Spring Framework
- [Singleton com Spring](src/main/java/com/designpatterns/spring/singleton/README.md)
- [Factory com Spring](src/main/java/com/designpatterns/spring/factory/README.md)
- [Strategy com Spring](src/main/java/com/designpatterns/spring/strategy/README.md)
- [Template Method com Spring](src/main/java/com/designpatterns/spring/template/README.md)

## Contexto do Projeto

Todos os exemplos são contextualizados em um sistema de gerenciamento de pedidos, onde exploramos diferentes aspectos como:
- Criação de pedidos
- Processamento de pagamentos
- Aplicação de descontos
- Notificações
- Logística de entrega

## Requisitos

- Java 17 ou superior
- Maven 3.6 ou superior

## Como Executar o Projeto

1. Clone o repositório:
```bash
git clone https://github.com/seu-usuario/design-patterns-java.git
cd design-patterns-java
```

2. Compilar o projeto:
```bash
mvn clean compile
```

3. Executar exemplos individuais:

Cada padrão possui sua própria classe Main com um método `main()` para demonstração. Por exemplo:

```bash
# Executar o exemplo do padrão Singleton
mvn exec:java -Dexec.mainClass="com.designpatterns.gof.creational.singleton.Main"

# Executar o exemplo do padrão Strategy
mvn exec:java -Dexec.mainClass="com.designpatterns.gof.behavioral.strategy.Main"
```

4. Para executar a aplicação Spring completa:
```bash
mvn spring-boot:run
```

## Estrutura de Cada Padrão

Cada implementação de padrão segue a seguinte estrutura:

```
📦 pattern-name/
  ├── README.md             # Explicação do padrão e quando usá-lo
  ├── [Classes específicas] # Implementação do padrão
  └── Main.java             # Exemplo de uso no sistema de pedidos
```

## Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para criar issues, sugerir melhorias ou enviar pull requests.
