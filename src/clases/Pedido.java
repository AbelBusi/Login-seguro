package clases;

/**
 *
 * @author cesar
 */
public class Pedido {
    
    private String IDPedido;
    
    private String Lista_productos;
    
    private String estado_del_pedido;
    
    //constructor vacio

    public Pedido() {
    }
    
    //constructor completo

    public Pedido(String IDPedido, String Lista_productos, String estado_del_pedido) {
        this.IDPedido = IDPedido;
        this.Lista_productos = Lista_productos;
        this.estado_del_pedido = estado_del_pedido;
    }
    
    //getters and setters

    public String getIDPedido() {
        return IDPedido;
    }

    public void setIDPedido(String IDPedido) {
        this.IDPedido = IDPedido;
    }

    public String getLista_productos() {
        return Lista_productos;
    }

    public void setLista_productos(String Lista_productos) {
        this.Lista_productos = Lista_productos;
    }

    public String getEstado_del_pedido() {
        return estado_del_pedido;
    }

    public void setEstado_del_pedido(String estado_del_pedido) {
        this.estado_del_pedido = estado_del_pedido;
    }
    
    //metodos
    
    public void agregarProeducto(){}
    public void eliminarProeducto(){}
    public void calcularTotal(){}
    public void enviarPedido(){}
    public void cancelarPedido(){}
    
}
