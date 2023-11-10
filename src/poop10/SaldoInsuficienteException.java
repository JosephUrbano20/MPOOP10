
package poop10;

/**

 * @author Urbano Meza Joseph Gael
 */
public class SaldoInsuficienteException extends Exception {
    
    /**
     * Constructor sin argumentos que establece el mensaje predeterminado como "Saldo Insuficiente".
     */
    public SaldoInsuficienteException() {
        super("Saldo Insuficiente");
    }

    /**
     * Constructor que permite establecer un mensaje personalizado para la excepción.
     * @param message Mensaje personalizado para la excepción.
     */
    public SaldoInsuficienteException(String message) {
        super(message);
    }
    
}

