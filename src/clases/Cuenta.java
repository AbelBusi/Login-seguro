package clases;

/**
 *
 * @author cesar
 */
public class Cuenta {
    
    
    private String ID_CUENTA;
    
    private String cliente;
    
    private String Historial_de_compras;
    
    private float pagos;
    
    //COnstructor vacio

    public Cuenta() {
    }
    
    //Cosntructor completo

    public Cuenta(String ID_CUENTA, String cliente, String Historial_de_compras, float pagos) {
        this.ID_CUENTA = ID_CUENTA;
        this.cliente = cliente;
        this.Historial_de_compras = Historial_de_compras;
        this.pagos = pagos;
    }
    
    //Gettes and setters 

    public String getID_CUENTA() {
        return ID_CUENTA;
    }

    public void setID_CUENTA(String ID_CUENTA) {
        this.ID_CUENTA = ID_CUENTA;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getHistorial_de_compras() {
        return Historial_de_compras;
    }

    public void setHistorial_de_compras(String Historial_de_compras) {
        this.Historial_de_compras = Historial_de_compras;
    }

    public float getPagos() {
        return pagos;
    }

    public void setPagos(float pagos) {
        this.pagos = pagos;
    }
    
    //metodos
    
    public void mostrr_producto(){}
    
    public void mostrar_total_pagar(){}
    
    
}
