package clases;

/**
 *
 * @author cesar
 */
public class Carritodecompras {
    
    private String lista_productos_seleccionados;
    
    private float TotalPagar;
    
    //constructor vacio

    public Carritodecompras() {
    }
    
    //Cosntructor completo

    public Carritodecompras(String lista_productos_seleccionados, float TotalPagar) {
        this.lista_productos_seleccionados = lista_productos_seleccionados;
        this.TotalPagar = TotalPagar;
    }
    
    //Getters and setters

    public String getLista_productos_seleccionados() {
        return lista_productos_seleccionados;
    }

    public void setLista_productos_seleccionados(String lista_productos_seleccionados) {
        this.lista_productos_seleccionados = lista_productos_seleccionados;
    }

    public float getTotalPagar() {
        return TotalPagar;
    }

    public void setTotalPagar(float TotalPagar) {
        this.TotalPagar = TotalPagar;
    }
    
    //metodos
    
    public void agregar_producto(){}
    
    public void calcular_total(){}
    
    public void mostar_carrito(){}
    
    
    
}
