#Author: lucas97meneses@gmail.com

Feature: Pesquisar google
  Eu como usuario quero realizar pesquisano google para validar informacoes

@slow
  Scenario Outline: Pesquisar no google
    Given que eu esteja no "https://www.google.com.br"
    When pesquisar <pesquisa>
    Then visualizo as <informacoes>
     

    Examples: 
      | pesquisa          |   informacoes     |
      | "Banco Itau"      |  "Banco Itau"     |
      | "Banco Bradesco"  |  "Banco Bradesco" |
      | "Banco Original"  |  "Banco Original" |