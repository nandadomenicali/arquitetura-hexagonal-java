# arquitetura-hexagonal-java 🚀

- Projeto realizado para estudo da arquitetura hexagonal

# O que é arquitetura-hexagonal?
- Arquitetura Hexagonal também conhecido como **Ports and Adapters.** É um padrão proposto por Alistair Cockburn para reduzir o acoplamento entre as diferentes camadas de um sistema, aumentando assim sua testabilidade. O padrão recebe este nome por conta da forma como uma aplicação que o utilize interage com o mundo externo: a partir de ports (portas) e adapters (adaptadoes).

- **Uma Arquitetura Hexagonal divide as classes de um sistema em dois grupos principais:** 1. Classes de domínio, isto é, diretamente relacionadas com o negócio do sistema. 2. Classes relacionadas com infraestrutura, tecnologias e responsáveis pela integração com sistemas externos (tais como bancos de dados). 3.Além disso, em uma Arquitetura Hexagonal, **classes de domínio não devem depender de classes relacionadas com infraestrutura, tecnologias ou sistemas externos.** A vantagem dessa divisão é desacoplar esses dois tipos de classes.

![hexagonal](hexagonal.png)

## Documentação da API ❖

#### Retorna todos os itens

```http
  GET /product/products
```

| Parâmetro   | Descrição                           |
| :---------- | :---------------------------------- |
| `Sem parametros`| Buscar lista de produtos |

#### Retorna um item

```http
  POST /product
```

| Parâmetro   | Descrição                     | RequestBody                     |
| :---------- | :-----------------------------| :-----------------------------|
| `Sem parametros` | Grava um produto na base | {name, price, amount}


#### Atualiza o Estoque

```http
  PATCH /product/{name}
```

| Parâmetro   | Tipo   | Descrição       | 
| :---------- | :---------- | :-----------------------------| 
| `Name`      | `String`       | Atualiza o Estoque |
