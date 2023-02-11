public class Main {
    public static void main(String[] args) {
        Metodos obx = new Metodos();
        final String COMENTARIO = "Introduce un numero";
        final String ELIGE_OPCION = "Introduce el numero de la operacion que quieras realizar:" +
                "\n1 --> SUMA\n2 --> RESTA\n3 --> MULTIPLICACION\n4 --> DIVISION";

        // Se comienza a ejecutar:
        Float num1 = EntradaSalida.entradaFloat(COMENTARIO);
        Float num2 = EntradaSalida.entradaFloat(COMENTARIO);
        if (num1 == null || num2 ==null){ // valida numeros de operacion
            System.out.println("**ERROR: NUMEROS INCORRECTOS**");
        }else {
            Integer opcion = EntradaSalida.entradaInt2(ELIGE_OPCION);
            if (opcion == null){ // valida opcion introducida
                System.out.println("**ERROR: OPCION NO VALIDA**");
            } else {
                if (opcion >= 1 && opcion <= 4) { // valida si opcion esta entra las posibles
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