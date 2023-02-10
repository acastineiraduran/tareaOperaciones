public class Main {
    public static void main(String[] args) {
        Metodos obx = new Metodos();


        Float num1 = EntradaSalida.entradaFloat(Metodos.COMENTARIO);
        Float num2 = EntradaSalida.entradaFloat(Metodos.COMENTARIO);
        if (num1 == null || num2 ==null){
            System.out.println("ERROR: NUMEROS INCORRECTOS");
        }else {

            Float resultado = obx.operacion(num1,
                    num2,
                    4);

            if (resultado != null) {
                System.out.println(resultado);
            } else {
                System.out.println("***ERROR EN CONSOLA***");
            }
        }
    }
}