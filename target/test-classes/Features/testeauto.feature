Feature: Teste Automacao

  Background:
#    Given realize login no site sauce demo
#    And estou na tela inicial


  Scenario: Validar titulo do pedido da tela do checkout
     Given realize login no site sauce demo
     And estou na tela inicial
     When seleciono a blua noir jacket
     And escolho o tamanho "L"
     And escolho a cor "Red"
     And clico no botão adiconar ao carrinho
     And clico no botão adiconar ao do menu checkout
     Then verifico se o titulo do pedido está correto