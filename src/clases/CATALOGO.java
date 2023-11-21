package clases;

/**
 *
 * @author cesar
 */
public class CATALOGO {
    
    private String lista_productos;
    
    private String producto_relevantes;
    
    //Construcot vacio

    public CATALOGO() {
    }
    
    //construcotr completo

    public CATALOGO(String lista_productos, String producto_relevantes) {
        this.lista_productos = lista_productos;
        this.producto_relevantes = producto_relevantes;
    }
    
    //gettes and setters

    public String getLista_productos() {
        return lista_productos;
    }

    public void setLista_productos(String lista_productos) {
        this.lista_productos = lista_productos;
    }

    public String getProducto_relevantes() {
        return producto_relevantes;
    }

    public void setProducto_relevantes(String producto_relevantes) {
        this.producto_relevantes = producto_relevantes;
    }
    
    //metodos
    
    
    
}
