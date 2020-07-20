package Opelcorsa.demo.Quimioterapia;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Quimioterapia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private int piso;
    private int numero;
    
    public Quimioterapia() {
		super();
	} 
    
	public long getId() {
		return id;
	}
	public void setId(final long id) {
		this.id = id;
	}
	public int getPiso() {
		return piso;
	}
	public void setPiso(final int piso) {
		this.piso = piso;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(final int numero) {
		this.numero = numero;
	}
    
}

