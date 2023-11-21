package clases;

/**
 *
 * @author cesar
 */
public class CLIENTE {
    
    private int ID;
    
    private String nombre;
    
    private String carrito_de_compra;
    
    private String Historial_de_compras;
    
    private float pagos;
    
    //constructor vacio

    public CLIENTE() {
    }
    
    //Constructor completo

    public CLIENTE(int ID, String nombre, String carrito_de_compra, String Historial_de_compras, float pagos) {
        this.ID = ID;
        this.nombre = nombre;
        this.carrito_de_compra = carrito_de_compra;
        this.Historial_de_compras = Historial_de_compras;
        this.pagos = pagos;
    }
    
    //Getters and Setters

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrito_de_compra() {
        return carrito_de_compra;
    }

    public void setCarrito_de_compra(String carrito_de_compra) {
        this.carrito_de_compra = carrito_de_compra;
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
    
    //Metodos
    
    public void comprar(){}
    
    public void pagar(){}
    
    public void devolver(){}
    
    public void consultar_saldo(){}
    
    
}
