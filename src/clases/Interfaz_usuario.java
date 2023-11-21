package clases;

/**
 *
 * @author cesar
 */
public class Interfaz_usuario {
    
    private String cliente_actual;
    
    private String cuenta_actual;
    
    //constructor vacio

    public Interfaz_usuario() {
    }
    
    //constructor completo

    public Interfaz_usuario(String cliente_actual, String cuenta_actual) {
        this.cliente_actual = cliente_actual;
        this.cuenta_actual = cuenta_actual;
    }
    
    //Getters and setters

    public String getCliente_actual() {
        return cliente_actual;
    }

    public void setCliente_actual(String cliente_actual) {
        this.cliente_actual = cliente_actual;
    }

    public String getCuenta_actual() {
        return cuenta_actual;
    }

    public void setCuenta_actual(String cuenta_actual) {
        this.cuenta_actual = cuenta_actual;
    }
    
    //metodos
    
    public void obtener_cliente_actual(){}
    
    public void establecer_cliente_actual(){}
    
    public void obtener_cuenta_actual(){}
    
    public void establecer_cuenta_actual(){}
    
}
