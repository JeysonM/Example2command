package commad;

public class ComandoAumentarCambio implements Comando {
	Bicicleta miBici;
	Impresor visor;
	
	
	public ComandoAumentarCambio(){
		miBici = new Bicicleta();
		visor = new Impresor();
	}

	@Override
	public void ejecutar() {
		miBici.getEngranaje().mayorVelocidad();
		miBici.getVelocimetro().setVelocidad(40);
		
		visor.imprimir(miBici.getEngranaje().getEstado());
		
		visor.imprimir("La velocidad maxima es: " + Integer.toString(miBici.getVelocimetro().getVelocidad()) + "Km/h");
		
	}

}
