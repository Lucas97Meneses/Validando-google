#Author: lucas.lucas97meneses@gmail.com

  @executa
Feature: Pesquisar com esquema
  Eu como usuario quero realizar pesquisa para validar informacoes


  Scenario: Pesquisando google
    Given que eu esteja no "https://www.google.com.br"
    When eu busco "Informação"
    Then valiso o "Informação"

  
  Scenario Outline: Pesquisando no google
    Given que eu esteja no "https://www.google.com.br"
    When eu busco <palavra>
    Then valiso o <retorno>

    Examples: 
      |  palavra           |  retorno            |
      | "E2E Treinamentos" | "E2E Treinamentos"  |
      | "Inovação"         | "Inovação"          |
      