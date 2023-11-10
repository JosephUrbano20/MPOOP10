
package poop10;

/**

 * @author Urbano Meza Joseph Gael
 */
public class CuentaBancaria {
    private double saldo; // Saldo de la cuenta bancaria.

    /**
     * Constructor sin argumentos que inicializa el saldo en 0 al crear una nueva instancia de la clase.
     */
    public CuentaBancaria() {
        saldo = 0;
    }

    /**
     * Constructor que nos permite inicializar el saldo con un valor específico al crear una nueva instancia de la clase.
     * @param saldo Valor inicial del saldo de la cuenta.
     */
    public CuentaBancaria(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Método para obtener el saldo actual de la cuenta.
     * @return El saldo actual de la cuenta.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Método para establecer un nuevo valor para el saldo de la cuenta.
     * @param saldo Nuevo saldo de la cuenta.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    /**
     * Método para realizar un depósito en la cuenta.
     * @param monto Cantidad de dinero a depositar en la cuenta.
     */
    public void depositar(double monto){
        System.out.println("Depositado: " + monto);
        saldo += monto;
    }
    
    /**
     * Método para realizar un retiro de la cuenta.
     * @param monto Cantidad de dinero a retirar de la cuenta.
     * @throws SaldoInsuficienteException Si el saldo de la cuenta es insuficiente para el retiro solicitado.
     */
    public void retirar(double monto) throws SaldoInsuficienteException{
        System.out.println("Retirando: " + monto);
        if(saldo <= monto)
            throw new SaldoInsuficienteException(); // Lanza una excepción si el saldo es insuficiente.
        else  
            saldo -= monto;
    }
}

