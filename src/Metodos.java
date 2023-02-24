/**
 * Libreria que pide numeros para realizar operaciones basicas
 * que serán escogidas en funcion del usuario
 *
 * @version 1.0
 * @author Angel Castineira
 */
public class Metodos {
    /**
     * opcion para realizar una operacion de suma
     */
    final static int SUMA = 1;
    /**
     * opcion para realizar una operacion de resta
     */
    final static int RESTA = 2;
    /**
     * opcion para realizar una operacion de multiplicacion
     */
    final static int MULTI = 3;
    /**
     * opcion para realizar una operacion de division
     */
    final static int DIV = 4;
    /**
     * opcion para realizar una operacion de raiz cuadrada
     */
    final static int RAIZ = 5;


    /**
     *Realiza una operacion de suma, resta, multiplicacion, division
     * o raiz
     * en funcion de la opcion escogida por el usuario
     *
     * @param num1 primer numero de la operacion, introducido por el usu
     * @param num2 segundo numero de la operacion, introducido por el usu
     * @param opcion tipo de operacion a realizar, introducirdo por el usuario
     * @return si es correcto resultado, si no, null
     */
    public static Float operacion (float num1, float num2, int opcion) {
        Float resultado = null;
            switch (opcion) {
                case SUMA:
                    try {
                        resultado = num1 + num2;
                    }catch (Exception e){
                        return null;
                    }
                    break; // si no pongo el break, se devuelve el ultimo resultado que lo tenga
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
                case RAIZ:
                    try {
                        resultado = (float)Math.pow(num1,(1/num2)); // num2 es el indice
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
