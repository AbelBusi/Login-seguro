package clases;

import java.time.LocalDate;

/**
 *
 * @author cesar
 */
public class InformacionSupermercado {
    
    private String nombre;
    
    private String ubicacion;
    
    private LocalDate Horario_atencion;
    
    //Constructor vacio

    public InformacionSupermercado() {
    }
    
    //Constructor completo

    public InformacionSupermercado(String nombre, String ubicacion, LocalDate Horario_atencion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.Horario_atencion = Horario_atencion;
    }
    
    //Gettes and setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public LocalDate getHorario_atencion() {
        return Horario_atencion;
    }

    public void setHorario_atencion(LocalDate Horario_atencion) {
        this.Horario_atencion = Horario_atencion;
    }
    
    
    
    
}
