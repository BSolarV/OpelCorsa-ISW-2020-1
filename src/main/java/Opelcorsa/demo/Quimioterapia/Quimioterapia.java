package Opelcorsa.demo.Quimioterapia;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import Opelcorsa.demo.Sillon.Sillon;

@Entity
public class Quimioterapia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private int piso;
    private int numero;
    
    @OneToMany(mappedBy = "quimioterapia")
    private List<Sillon> sillones;
    
    
    
    public Quimioterapia(long id, int piso, int numero, List<Sillon> sillones) {
		super();
		this.id = id;
		this.piso = piso;
		this.numero = numero;
		this.sillones = sillones;
	}

	public List<Sillon> getSillones() {
		return sillones;
	}

	public void setSillones(final List<Sillon> sillones) {
		this.sillones = sillones;
	}

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

