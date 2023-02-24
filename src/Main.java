/**
 * Clase que implementa los metodos creados en la clase Metodos
 *
 * @author angel
 * @version 2.0 24/02/23
 */
public class Main {
    /**
     * metodo main
     *
     * @param args
     */
    public static void main(String[] args) {
        Metodos obx = new Metodos();
        /**
         * Le pide al ususario que introduzca un numero
         */
        final String COMENTARIO = "Introduce un numero";
        /**
         * Pregunta al usuario que operacion quiere realizar
         */
        final String ELIGE_OPCION = "Introduce el numero de la operacion que quieras realizar:" +
                "\n1 --> SUMA\n2 --> RESTA\n3 --> MULTIPLICACION\n4 --> DIVISION\n5 --> RAIZ";

        // Se comienza a ejecutar:
        /**
         * le pido al ususairo el primer numero
         */
        Float num1 = EntradaSalida.entradaFloat(COMENTARIO);
        /**
         * le pido al ususario el segundo numero
         */
        Float num2 = EntradaSalida.entradaFloat(COMENTARIO);

        /**
         * condicional anidado que va avanzando en funcion de las respuestas del ususario.
         * E
         *
         *
         *
         */
        if (num1 == null || num2 ==null){ // valida numeros de operacion
            System.out.println("**ERROR: NUMEROS INCORRECTOS**");
        }else { // si los numeros introducidos son correctos
            Integer opcion = EntradaSalida.entradaInt2(ELIGE_OPCION);
            if (opcion == null){ // valida opcion introducida
                System.out.println("**ERROR: OPCION NO VALIDA**");
            } else {
                if (opcion >= 1 && opcion <= 5) { // valida si opcion esta entra las posibles
                    Float resultado = obx.operacion(num1, num2, opcion);
                    if (resultado != null) { // valida var resultado
                        if (Float.isNaN(resultado)) { // valida si operacion es viable
                            System.out.println("**ERROR: IMPOSIBLE DE CALULAR**");
                        } else {
                            System.out.println("resultado = " + resultado);
                        }
                    } else {
                        System.out.println("**ERROR EN OPERACION**");
                    }
                }
                else {
                    System.out.println("**ERROR: OPCION ESCOGIDA NO DISPONIBLE**");
                }
            }
        }
    }
}