package clases;

/**
 *
 * @author cesar
 */
public class DetalleBoleta {
    
    private String producto;
    
    private int cantidadComprada;
    
    private float precio_por_unidad;
    
    private float precio_total;
    
    //constructor vacio

    public DetalleBoleta() {
    }
    
    //constructor completo

    public DetalleBoleta(String producto, int cantidadComprada, float precio_por_unidad, float precio_total) {
        this.producto = producto;
        this.cantidadComprada = cantidadComprada;
        this.precio_por_unidad = precio_por_unidad;
        this.precio_total = precio_total;
    }
    
    //getters and setters

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidadComprada() {
        return cantidadComprada;
    }

    public void setCantidadComprada(int cantidadComprada) {
        this.cantidadComprada = cantidadComprada;
    }

    public float getPrecio_por_unidad() {
        return precio_por_unidad;
    }

    public void setPrecio_por_unidad(float precio_por_unidad) {
        this.precio_por_unidad = precio_por_unidad;
    }

    public float getPrecio_total() {
        return precio_total;
    }

    public void setPrecio_total(float precio_total) {
        this.precio_total = precio_total;
    }
    
    
    
}
