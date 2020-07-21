package Opelcorsa.demo.Sillon;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import Opelcorsa.demo.Quimioterapia.Quimioterapia;

@Entity
public class Sillon {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String descripcion;
    private String estado;
    
    @ManyToOne
    @JoinColumn(name="id_sala")
    private Quimioterapia sala;
    

	public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(final String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public long getId(){
        return this.id;
    }

}