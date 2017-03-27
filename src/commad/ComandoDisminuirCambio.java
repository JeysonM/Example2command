package commad;

public class ComandoDisminuirCambio implements Comando {

	Bicicleta miBici;
	Impresor visor;
	
	
	public ComandoDisminuirCambio(){
		miBici = new Bicicleta();
		visor = new Impresor();
	}
		
	@Override
	public void ejecutar() {
		miBici.getEngranaje().menorVelocidad();
		miBici.getVelocimetro().setVelocidad(10);
		
		visor.imprimir(miBici.getEngranaje().getEstado());
		visor.imprimir("La velocidad maxima es: " + Integer.toString(miBici.getVelocimetro().getVelocidad()) + "Km/h");
		
	}
	

}
