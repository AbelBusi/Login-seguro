package clases;

/**
 *
 * @author cesar
 */
public class SoporteAlCliente {
    
    private String lista_de_consultas;
    
    //Constructor completo

    public SoporteAlCliente(String lista_de_consultas) {
        this.lista_de_consultas = lista_de_consultas;
    }

    //Getters and setters
    
    
    public SoporteAlCliente() {
    }

    public String getLista_de_consultas() {
        return lista_de_consultas;
    }

    public void setLista_de_consultas(String lista_de_consultas) {
        this.lista_de_consultas = lista_de_consultas;
    }
    
    
    //Metodos
    
    public void AgregarConsulta(){}
    
    public void EliminarConsulta (){}
    
    public void BuscarConsulta(){}
    
    public void MostrarConsultas(){}
    
}
