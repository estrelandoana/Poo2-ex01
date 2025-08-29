# Poo2-ex01
## 1. Interface de Animais 🐶🐱
    • Crie uma interface chamada Animal com o método emitirSom().
    • Implemente duas classes, Cachorro e Gato, que implementem essa interface.
    • Depois, faça um programa que crie uma lista de animais e chame o método emitirSom() para cada um.
👉 **Pergunta:** O que acontece se você adicionar mais animais diferentes no futuro?
**Resposta:** O programa continua funcionando porque a interface garante o contrato do método emitirSom(), então só seria necessário adicionar a nova classe.

## 2. Interface de Formas Geométricas 🔺⬛ (composição)
    • Crie uma interface chamada Forma com o método calcularArea().
    • Implemente as classes Quadrado (lado) e Circulo (raio).
Agora, crie uma classe Desenho que possui uma lista de formas (composição) e um método calcularAreaTotal() que soma as áreas de todas as formas.
👉 **Pergunta:** Por que é interessante usar composição em Desenho em vez de herança?
**Resposta:** Porque Desenho não é uma Forma, mas contém várias. Composição permite criar desenhos com múltiplas formas sem forçar uma hierarquia errada. Assim, Desenho pode combinar qualquer conjunto de formas.

## 3. Interface de Pagamentos 💳💵
    • Crie uma interface chamada Pagamento com o método pagar(double valor).
    • Implemente as classes CartaoCredito, Pix e Dinheiro.
    • Crie um programa que simule diferentes formas de pagamento para um mesmo produto.
👉 **Pergunta:** Por que é mais flexível usar uma interface nesse caso do que criar apenas uma classe Pagamento com vários if/else?
**Resposta:** Porque cada forma de pagamento é independente. Se surgirem novas opções, só é necessário criar uma nova classe.

## 4. Interface de Veículos 🚗🚲🛴 (uso de default)
    • Crie uma interface Veiculo com os métodos acelerar() e frear().
    • Adicione um método default chamado ligarMotor() que imprime "Motor ligado!".
    • Implemente as classes Carro e Moto, que podem usar o método ligarMotor() diretamente da interface.
    • Implemente também a classe Bicicleta, que sobrescreve o método ligarMotor() para mostrar "Bicicleta não tem motor!".
👉 **Pergunta:** Como o uso de default ajuda a evitar duplicação de código nas classes?
**Resposta:** O método ligarMotor() já vem pronto na interface, evitando que todas as classes precisem reimplementar o mesmo código.

## 5. Interface de Notificações 📧📱
    • Crie uma interface chamada Notificacao com o método enviarMensagem(String mensagem).
    • Implemente duas classes: Email e SMS.
    • Faça um programa que receba uma lista de notificações e envie a mesma mensagem usando diferentes meios.
👉 **Pergunta:** Qual vantagem de usar interface se no futuro você quiser adicionar WhatsApp ou Push Notification?
**Resposta:** Só precisa criar uma nova classe que implementa Notificacao. O restante do código continua funcionando sem alterações — apenas adicionando mais opções à lista.
