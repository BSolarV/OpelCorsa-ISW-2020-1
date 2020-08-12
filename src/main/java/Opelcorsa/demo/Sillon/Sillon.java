package Opelcorsa.demo.Sillon;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIdentityReference;

import Opelcorsa.demo.Quimioterapia.Quimioterapia;

@Entity
public class Sillon implements Serializable{

    private static final long serialVersionUID = 6511717415492391339L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String descripcion;
    private String estado = "libre";
    
    @ManyToOne()
    @JoinColumn(name="id_sala")
    @JsonIdentityReference(alwaysAsId = true)
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

	public Quimioterapia getSala() {
		return sala;
	}

	public void setSala(Quimioterapia sala) {
		this.sala = sala;
	}

}