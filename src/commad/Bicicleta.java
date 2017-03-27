package commad;

public class Bicicleta {

	Engranaje engranaje;
	Velocimetro velocimetro;
	
	public Bicicleta(){
		this.engranaje = new Engranaje();
		this.velocimetro = new Velocimetro();
	}
	
	public Engranaje getEngranaje(){
		return engranaje;
	}
	
	public void setMiEngranaje(Engranaje engranaje){
		this.engranaje = engranaje;
		
	}
	
	public Velocimetro getVelocimetro(){
		return velocimetro;
	}
	
	public void setVelocimetro(Velocimetro velocimetro){
		this.velocimetro = velocimetro;
	}

}
