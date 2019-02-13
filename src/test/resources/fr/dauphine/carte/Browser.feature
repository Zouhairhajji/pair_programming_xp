Feature: Browser



  Scenario: se deplacer dans un zoo à la position 10 10 pour capturer un animal normal

    Given il y a un animal a la position 10 0
    When le navigateur capture 0 animal à la position 10 10
    Then le coffre de navigateur doit contenir 0 animal et le naviteur est en vie
    
    Given il y a un animal a la position 10 10
    When le navigateur capture 1 animal à la position 10 10
    Then le coffre de navigateur doit contenir 1 animal et le naviteur est en vie



  Scenario: ameliorer le coffre du navigateur

    Given il y a 1 animal dans le coffre du navigateur
    When le navigateur ameliore son coffre de 5 elements
    Then la capacite du coffre devrait etre 10 elements

    Given il y a 0 animal dans le coffre du navigateur
    When le navigateur ameliore son coffre de 0 elements
    Then la capacite du coffre devrait etre 5 elements