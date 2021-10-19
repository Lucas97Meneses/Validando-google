#Author: lucas@lucas.com.br


Feature: Pesquisar no google
  Eu como usuario quero acessar o site  para realizar uma pesquisa

@nExecuta
  Scenario: Pesquisar o nome da escola no google
    Given que eu esteja no google "https://www.google.com.br"
    When pesquise o nome da escola 
    Then valido as informacoes
  

