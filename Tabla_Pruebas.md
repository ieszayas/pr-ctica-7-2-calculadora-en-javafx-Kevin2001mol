| ID Caso Prueba | Descripción Caso de Prueba                                      | Entrada                 | Salida Esperada                                      | Resultado |
|---------------|-----------------------------------------------------------------|-------------------------|-----------------------------------------------------|-----------|
| CP-001       | Suma de dos números positivos                                   | 5 + 3 =                 | 8                                                   | Exitoso   |
| CP-002       | Suma de número positivo y negativo                              | 7 + (-2) =              | 5                                                   | Exitoso   |
| CP-003       | Resta de dos números                                           | 9 - 4 =                 | 5                                                   | Exitoso   |
| CP-004       | Multiplicación de dos números positivos                         | 6 * 3 =                 | 18                                                  | Exitoso   |
| CP-005       | Multiplicación con un número negativo                           | 4 * (-2) =              | -8                                                  | Exitoso   |
| CP-006       | División de dos números                                        | 8 / 2 =                 | 4                                                   | Exitoso   |
| CP-007       | División entre cero                                            | 5 / 0 =                 | Error                                               | Exitoso   |
| CP-008       | Agregar decimal a un número                                    | 3.5                     | 3.5                                                 | Exitoso   |
| CP-009       | Operación con números decimales                                | 2.5 + 1.5 =             | 4.0                                                 | Exitoso   |
| CP-010       | Borrar resultados                                             | 5 + 3, luego C          | Pantalla vacía                                      | Exitoso   |
| CP-011       | Uso del botón igual sin operación                              | =                       | Mismo número                                        | Exitoso   |
| CP-012       | Guardar/sumar número en memoria (M+)                           | 6, M+                   | Memoria = +6                                        | Exitoso   |
| CP-013       | Borrar número en memoria (MC)                                 | MC                      | Memoria = 0                                         | Exitoso   |
| CP-014       | Recuperar número de memoria                                   | MR                      | Último valor M                                      | Exitoso   |
| CP-015       | Cambio de signo positivo a negativo                           | 5, +/-                   | -5                                                  | Exitoso   |
| CP-016       | Cambio de signo negativo a positivo                           | -7, +/-                  | 7                                                   | Exitoso   |
| CP-017       | Los colores y tamaños de los botones cumplen criterios de usabilidad/accesibilidad | N/D                     |                                                   | Exitoso   |
| CP-018       | Estructura del proyecto                                       | N/D                     | Se utiliza la división por paquetes MVC; VistaControlador y Modelo para organizar las clases. | Exitoso   |
| CP-019       | Comprobación fichero jar                                      | Proyecto compilado      | Se genera y prueba el fichero jar empaquetado.     | Exitoso   |
