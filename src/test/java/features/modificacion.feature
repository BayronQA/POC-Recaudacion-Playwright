Feature: Automatización de pruebas de Inicio de sesión y modificación de datos de una empresa
  como usuario con rol TE quiero iniciar sesión y realizar una modificación de un dato en una de mis empresas.

  Scenario: Iniciar Sesión con ROL TE
    Given Abro el navegador y navego a la página de inicio
    When Hago clic en Ingresar aquí
    And Ingreso el nombre de usuario valido y la contraseña valida
    And Presiono el botón Ingresar
    Then Debería acceder correctamente con el ROL de TE

  Scenario Outline: Actualizar Datos de la Empresa
    Given Estoy en el menú de actualización de datos
    When Selecciono Modificación datos Empresa
    And Actualizo la direccion <calle> de la empresa
    And Presiono Siguiente paso
    Then Valido si cambió la direccion <calle>
    And Presiono Confirmar

    Examples:
      |calle|
      |Calle 33|
      |Calle 32|
      |Calle 31|

