package Opelcorsa.demo.Quimioterapia;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
<<<<<<< HEAD
=======

>>>>>>> 380a2be9bd6bc805cb2dc76a5270ceca57615485
public class Quimioterapia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
<<<<<<< HEAD
    private int piso;
    private int numero;
    
    public Quimioterapia() {
		super();
	} 
=======
>>>>>>> 380a2be9bd6bc805cb2dc76a5270ceca57615485
    
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

