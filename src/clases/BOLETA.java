package clases;

import java.time.LocalDate;

/**
 *
 * @author cesar
 */
public class BOLETA {
    
    private int IDBoleta;
    
    private LocalDate fecha;
    
    private String Metodo_pago;
    
    private float total;
    
    private String lista_detalle_venta;
    
    //constructor vacio

    public BOLETA() {
    }
    
    //constructor completo

    public BOLETA(int IDBoleta, LocalDate fecha, String Metodo_pago, float total, String lista_detalle_venta) {
        this.IDBoleta = IDBoleta;
        this.fecha = fecha;
        this.Metodo_pago = Metodo_pago;
        this.total = total;
        this.lista_detalle_venta = lista_detalle_venta;
    }
    
    //getters and setters 

    public int getIDBoleta() {
        return IDBoleta;
    }

    public void setIDBoleta(int IDBoleta) {
        this.IDBoleta = IDBoleta;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getMetodo_pago() {
        return Metodo_pago;
    }

    public void setMetodo_pago(String Metodo_pago) {
        this.Metodo_pago = Metodo_pago;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getLista_detalle_venta() {
        return lista_detalle_venta;
    }

    public void setLista_detalle_venta(String lista_detalle_venta) {
        this.lista_detalle_venta = lista_detalle_venta;
    }
    
    //metodos
    
    public void calcularTotal(){}
    
    public void GenerarBoleta(){}
    
    public void enviarBoleta(){}
    
}
