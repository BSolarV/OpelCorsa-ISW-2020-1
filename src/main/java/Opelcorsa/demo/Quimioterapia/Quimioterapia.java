package Opelcorsa.demo.Quimioterapia;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import Opelcorsa.demo.Sillon.Sillon;

@Entity
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
public class Quimioterapia {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private int piso;
    private int numero;
    
    @OneToMany(mappedBy="sala")
    private List<Sillon> sillones;

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
    
	public void addSillon(Sillon sillon) {
		this.sillones.add(sillon);
	}
	
	public void removeSillon(Sillon sillon) {
		this.sillones.remove(sillon);
	}
}

