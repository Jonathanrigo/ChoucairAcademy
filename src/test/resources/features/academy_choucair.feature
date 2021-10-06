#Autor: Jonathan Rios Gómez
  @Tags
  Feature: Academy Choucair
    As a user, I want to learn how to automate in screamplay at the
  Choucair Academy with the automation course

  @Scenario1
  Scenario Outline:  Search for a automation course
    Given Than bradon wants to learn automation at the academy choucair
      | strUser   | strPassword   |
      | <strUser> | <strPassword> |
    When He search for the course on the choucair academy platform
      | strCourse   |
      | <strCourse> |
    Then He finds the course called
      | strCourse   |
      | <strCourse> |

    Examples:
    | strUser | strPassword   | strCourse               |
    | tuUserg | tuUser        | Metodología Bancolombia |
    | tuUser  | tuPassword    | Bancolombia Metodologia |

    @CasoAlterno
    Scenario Outline:  Search for a automation course
      Given Un usuario ingresa a academia choucair
      When Ingresa datos incorrectos en la plataforma
        | strUser   | strPassword   |
        | <strUser> | <strPassword> |
      Then El sistema ahorra mensaje de error
        | strCourse   |
        | <strCourse> |

      Examples:
        | strUser | strPassword   | strCourse                                       |
        | xxxxxx  | yyyyyyyyyyyyy | Acceso inválido. Por favor, inténtelo otra vez. |

