public class Metodos {
    final static int SUMA = 1;
    final static int RESTA = 2;
    final static int MULTI = 3;
    final static int DIV = 4;
    final static String COMENTARIO = "Introduce un numero";
    public static Float operacion (float num1, float num2, int opcion) {
        Float resultado = null;
            switch (opcion) {
                case SUMA:
                    try {
                        resultado = num1 + num2;
                    }catch (Exception e){
                        return null;
                    }
                    break;
                case RESTA:
                    try {
                        resultado = num1 - num2;
                    }catch (Exception e){
                        return null;
                    }
                    break;
                case MULTI:
                    try {
                        resultado = num1 * num2;
                    }catch (Exception e){
                        return null;
                    }
                    break;
                case DIV:
                    try {
                        resultado = num1 / num2;
                    }catch (Exception e){
                        return null;
                    }
                    break;
                default:
                    return null;
            }
        return resultado;
    }
}
