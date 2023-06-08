#Author: epalacios@sistecredito.com

Feature: get Research Article
  As a user I want to consult the Research articles
  to see how many research articles are created

  Background: set environment
    * url url

  @GetArticlesCreated
  Scenario: Get all articles are created

    Given path 'search'
    And param q = 'title:DNA'
    When method get
    Then status 200
    Then response.data == '#[]'