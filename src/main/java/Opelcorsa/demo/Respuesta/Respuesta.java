package Opelcorsa.demo.Respuesta;

public class Respuesta {
    private boolean ok;
    private String mensaje;

    
    public Respuesta(boolean ok, String mensaje) {
		super();
		this.ok = ok;
		this.mensaje = mensaje;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public boolean isOk() {
        return ok;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

}