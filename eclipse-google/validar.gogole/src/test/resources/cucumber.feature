#Author: lucas97meneses@gmail.com

Feature: Realizar pesquisa no gogole
  Eu como usuario quero realizar pesquisas no google para receber as informacoes

@nExecuta
Background: Acessar o google
    Given que eu esteja no "https://www.google.com.br"


    Scenario: Pesquisar E2E Treinamentos
    When pesquisar "E2E Treinamentos"
    Then valido nome da escola "E2E Treinamentos"
    
    Scenario: Pesquisar Inovacao
    When pesquisar "Inovação"
    Then valido inovacao "Inovação"
    
    Scenario: Pesquisar Felicidade
    When pesquisar "Felicidade"
    Then valido Felicidade "Felicidade"


