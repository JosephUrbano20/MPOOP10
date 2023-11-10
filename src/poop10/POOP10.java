package poop10;

/**

 * @author UrbanoMezaJosephGael
 */
public class POOP10 {

    
    public static void main(String[] args) {
        // Imprime el mensaje de Hola usuario, me da gusto que estes aqui nuevamente en la consola.
        System.out.println("Hola usuario, me da gusto que estes aqui nuevamente");
        
        // Declaracion de un array de cadenas llamado "mensaje" con tres elementos.
        String[] mensaje = {"Primero", "Segundo", "Tercero"};
        
        try {
            // Usamos un bucle for para imprimir los elementos del array "mensaje".
            for (int i = 0; i < 3; i++) {
                System.out.println("Mensaje " + mensaje[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            // Captura y maneja la excepción ArrayIndexOutOfBoundsException si ocurre.
            // Imprime un mensaje de error junto con el mensaje de la excepción.
            System.out.println("Error: " + e.getMessage());
        }
        
        // Imprime un mensaje en la consola.
        System.out.println("Pongan Travis");
        
        try {
            // Intenta realizar una operación de división (0 dividido por 1).
            double x = 0 / 1; // Se cambió la división por 0 a 1 para evitar la excepción.
            // Imprime el resultado de la operación (0) en la consola.
            System.out.println(x);
        } catch (ArithmeticException e) {
            // Captura y maneja la excepción ArithmeticException si ocurre.
            // Imprime un mensaje de error junto con el mensaje de la excepción.
            System.out.println("Error: " + e.getMessage());
        }
        
        // Imprime un mensaje en la consola.
        System.out.println("Pongan a Kanye");
        
        try {
            // Llama al método "metodoDivision" con argumentos y captura la excepción UnsupportedOperationException si es lanzada.
            double division = metodoDivision(4f, 6.0);
        } catch (UnsupportedOperationException e) {
            // Captura y maneja la excepción UnsupportedOperationException si ocurre.
            // Imprime un mensaje de error junto con el mensaje de la excepción.
            System.out.println("Error: " + e.getMessage());
        }
    }

    /**
     * Método privado que lanza una excepción UnsupportedOperationException con un mensaje específico.
     * @param f Un número en punto flotante.
     * @param d Otro número en punto flotante.
     * @return Nunca se llega a retornar debido a que la excepción es lanzada incondicionalmente.
     * @throws UnsupportedOperationException Siempre lanza esta excepción con el mensaje "Operación no soportada".
     */
    private static double metodoDivision(float f, double d) throws UnsupportedOperationException {
        // Lanza incondicionalmente una excepción UnsupportedOperationException con un mensaje específico.
        throw new UnsupportedOperationException("Operación no soportada");
    }
}


