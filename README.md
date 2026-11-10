# Padrão Mediator

Exemplo do padrão comportamental **Mediator** aplicado a uma sala de chat. Os
participantes não se comunicam diretamente uns com os outros: toda mensagem passa
por um mediador (a sala), que a distribui aos demais. Assim, os participantes
dependem apenas do mediador, e não de cada colega individualmente.

## Conteúdo do repositório

- **Código-fonte** do exemplo implementando o padrão Mediator (sala de chat).
- **Casos de teste** (JUnit) cobrindo a distribuição das mensagens, o remetente que não recebe a própria mensagem e a ordem das mensagens.
- **Diagrama UML** das classes, em formato de imagem.
