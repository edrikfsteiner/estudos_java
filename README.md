# Estudos sobre Java na Betha

## POO e SOLID (19/12-20/12)

Foram estudados conceitos de Programação Orientada a Objetos, como encapsulamento, herança, polimorfismo e interfaces. 
Em SOLID, os significados e exemplos de cada princípio foram estudados. 2 projetos foram feitos:

### [tributario](https://github.com/edrikfsteiner/estudos_java/tree/main/src/poo/tributario): 
- Foram aplicados conceitos de encapsulamento (private, protected, public), herança (Imposto > ImpostoRenda),
polimorfismo de sobreposição (calcularImposto() em ImpostoRenda) e polimorfismo de sobrecarga (calcularImposto() em ImpostoConsumo).

### [biologia](https://github.com/edrikfsteiner/estudos_java/tree/main/src/poo/biologia):
- Foram aplicados os conceitos POO, classes abstratas e interface, junto com alguns princípios SOLID.

## API (26/12-27/12)

### [farmacia](https://github.com/edrikfsteiner/farmacia/tree/main/src/main/java/com/farmacia):
- Foi implementado uma API básica com arquitetura em camadas, endpoints GET, POST, PUT e DELETE,
utilizando Spring, Lombok, JPA, PostgreSQL e documentação em Swagger.

## Código Limpo (27/12-30/12)

Lido até a página 40 do livro [Código Limpo](https://github.com/free-educa/books/blob/main/books/Codigo%20Limpo%20-%20Completo%20PT.pdf).

## Fluxo do Integrações, webhook e gateway (30/12)

Foram estudados os conceitos do [fluxo de atendimento do Integrações](https://gitlab.services.betha.cloud/integracao/documentacao/-/blob/master/processos/Atendendo%20chamado.md),
[webhook](https://www.tecmundo.com.br/software/401180-o-que-e-um-webhook-como-funciona-e-como-aplicar.htm) e 
[API Gateway](https://www.youtube.com/watch?v=hWRRdICvMNs&pp=ugMICgJwdBABGAHKBQthcGkgZ2F0ZXdheQ%3D%3D).

## Design Patterns: Factory e Builder (30/12-02/01)

Foram estudados os métodos [Factory](https://refactoring.guru/design-patterns/factory-method) e [Builder](https://refactoring.guru/design-patterns/builder),
2 projetos foram feitos:

### [exemplo_factory](https://github.com/edrikfsteiner/estudos_java/tree/main/src/design_patterns/exemplo_factory):
- Usando a temática de um restaurante de pizzas, o factory é implementado com um RestauranteFactory e 
products Pizza, seguindo princípios SOLID.

### [exemplo_builder](https://github.com/edrikfsteiner/estudos_java/tree/main/src/design_patterns/exemplo_builder):
- O método builder é implementado com o AviaoBuilder, que faz o trabalho da construção de um objeto Aviao,  
que pode ter diferentes componentes Motor, baseado em um TipoAviao passado, 
permitindo uma flexibilidade e simplicidade do código.

## Studio Aplicações (02/01-03/01)

Foram assistidos todos os [vídeos](https://docs.plataforma.betha.cloud/docs/videos/studio-aplicacoes/apresentacao) do Studio Aplicações, 
além do [slide](https://docs.google.com/presentation/d/1b8EGLr5BpI0GtDZv9Zp5pFIKedz-XClcsYxjJjomiqU/edit) passado pelo Patrick.