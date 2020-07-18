package Opelcorsa.demo.Sillon;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sillon {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String descripcion;
    private String estado;

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

	public Sillon(String descripcion, String estado) {
		this.descripcion = descripcion;
		this.estado = estado;
    }


}