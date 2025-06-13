public class Prueba {
    public static void main(String args[]) {
        int resultado;
        try {
            resultado = 10 / 0;
            System.out.println(resultado);
        } catch (ArithmeticException e) {
            System.out.println("No se puedo hacer la multiplicación. F");
        } catch (Exception e) {

        } finally {
            System.out.println("EJECUCION DEL FINALLY");
        }
        System.out.println("EL PROGRAMA CONTINUO SIN LIOS--");
    }
}