package clases;

/**
 *
 * @author cesar
 */
public class DetallePedido {
    
    private String producto;
    
    private int CantidadSeleccionada;
    
    private float precio_total;
    
    //Constructor vacio

    public DetallePedido() {
    }
    
     //Constructor completo

    public DetallePedido(String producto, int CantidadSeleccionada, float precio_total) {
        this.producto = producto;
        this.CantidadSeleccionada = CantidadSeleccionada;
        this.precio_total = precio_total;
    }
    
    //gettes ans setters 

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidadSeleccionada() {
        return CantidadSeleccionada;
    }

    public void setCantidadSeleccionada(int CantidadSeleccionada) {
        this.CantidadSeleccionada = CantidadSeleccionada;
    }

    public float getPrecio_total() {
        return precio_total;
    }

    public void setPrecio_total(float precio_total) {
        this.precio_total = precio_total;
    }
    
    //metodos
    
    public void CalcularTotal(){}
    
}
