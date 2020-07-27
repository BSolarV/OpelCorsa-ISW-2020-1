package Opelcorsa.demo.Quimioterapia;

public class SalaSillon{
	
	private long idSala;
	private long idSillon;
	
	public SalaSillon(long idSala, long idSillon) {
		super();
		this.idSala = idSala;
		this.idSillon = idSillon;
	}
	public long getIdSala() {
		return idSala;
	}
	public void setIdSala(long idSala) {
		this.idSala = idSala;
	}
	public long getIdSillon() {
		return idSillon;
	}
	public void setIdSillon(long idSillon) {
		this.idSillon = idSillon;
	}
	
}