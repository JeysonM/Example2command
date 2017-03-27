package commad;

public class Engranaje {
	private String estado;
	
	public Engranaje(){
		this.estado = "Desconfigurado";
		
	}
	
	public String getEstado(){
		return estado;
	}
	
	public void mayorVelocidad(){
		this.estado = "Encaminado a tener mayor velocidad";
	}
	
	public void menorVelocidad(){
		this.estado = "Encaminado a tener menor velocidad";
	}
}
