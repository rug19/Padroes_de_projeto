# Padrões de Projeto - Atividades em Java

Este repositório contém implementações de diversos padrões de projeto (Design Patterns) em Java, desenvolvidos como atividades práticas.

## 📋 Padrões Implementados

### 1. Strategy Pattern (`strategy_pattern/`)

**Descrição**: Padrão comportamental que permite definir uma família de algoritmos, encapsulá-los e torná-los intercambiáveis. O padrão Strategy permite que o algoritmo varie independentemente dos clientes que o utilizam.

**Aplicação**: Sistema de cálculo de frete com diferentes estratégias:

- Transportadora
- Correios
- Retirada Local

**Como executar**:

```bash
cd strategy_pattern/src
javac *.java
java Main
```

---

### 2. Observer Pattern (`observer/`)

**Descrição**: Padrão comportamental que define uma dependência um-para-muitos entre objetos, de modo que quando um objeto muda de estado, todos os seus dependentes são notificados e atualizados automaticamente.

**Aplicação**: Sistema de notificação de produtos onde clientes são notificados sobre mudanças de preço e estoque.

**Como executar**:

```bash
cd observer
javac *.java
java Main
```

---

### 3. Factory Method Pattern (`method_factory/`)

**Descrição**: Padrão criacional que fornece uma interface para criar objetos em uma superclasse, mas permite que as subclasses alterem o tipo de objetos que serão criados.

**Aplicação**: Sistema de criação de diferentes tipos de transporte (Carro, Bicicleta) através de factories específicas.

**Como executar**:

```bash
cd method_factory/src
javac *.java
java Main
```

---

### 4. Polimorfismo + Pure Fabrication (`polimorphism_pure_fabrication/`)

**Descrição**: Combina o conceito de polimorfismo com o padrão GRASP Pure Fabrication (Fabricação Pura), que sugere criar classes que não representam conceitos do domínio do problema, mas são necessárias para obter baixo acoplamento e alta coesão.

**Aplicação**: Sistema de notificações de pedidos com múltiplos canais (Email, SMS, WhatsApp) usando uma classe de serviço inventada (ServicoNotificacao) para gerenciar as notificações.

**Como executar**:

```bash
cd polimorphism_pure_fabrication
javac *.java
java Main
```

---

### 5. Information Expert + Creator (`information_exprt_and_creato/`)

**Descrição**: Padrões GRASP (General Responsibility Assignment Software Patterns):

- **Information Expert**: Atribui responsabilidade à classe que possui a informação necessária para cumprir a responsabilidade.
- **Creator**: Define qual classe deve ser responsável pela criação de instâncias de outras classes.

**Aplicação**: Sistema de vendas onde a classe `Venda` é responsável por criar `ItemVenda` (Creator) e calcular o total (Information Expert), pois possui todas as informações necessárias.

**Como executar**:

```bash
cd information_exprt_and_creato/src
javac *.java
java Main
```

---

### 6. Adapter Pattern (`adpter/`)

**Descrição**: Padrão estrutural que permite que objetos com interfaces incompatíveis trabalhem juntos. O Adapter atua como um intermediário que converte a interface de uma classe em outra interface esperada pelos clientes.

**Aplicação**: Sistema elétrico com tomadas de diferentes padrões (dois e três pinos). O adaptador permite que um aparelho com plugue de três pinos seja conectado em uma tomada de dois pinos.

**Como executar**:

```bash
cd adpter
javac *.java
java Main
```

---

## 🚀 Requisitos

- Java Development Kit (JDK) 8 ou superior
- Terminal/Prompt de Comando

## 📚 Conceitos Importantes

- **Padrões Criacionais**: Lidam com mecanismos de criação de objetos (Factory Method)
- **Padrões Comportamentais**: Lidam com comunicação entre objetos (Strategy, Observer)
- **Padrões Estruturais**: Lidam com composição de classes e objetos (Adapter)
- **Padrões GRASP**: Princípios gerais de atribuição de responsabilidades (Information Expert, Creator, Pure Fabrication)
- **Polimorfismo**: Capacidade de objetos de diferentes classes responderem à mesma mensagem de maneiras diferentes

## 📝 Notas

Para compilar e executar qualquer projeto Java:

1. Navegue até o diretório do projeto
2. Compile com: `javac *.java` ou `javac NomeDoArquivo.java`
3. Execute com: `java Main` (ou o nome da classe principal)
