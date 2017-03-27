package commad;

public class PanelFrontal {
	Comando comando;
	
	public void asignarComando(Comando newComando){
		this.comando = newComando;
	}
	
	public void palancaAccionada(){
		comando.ejecutar();
	}
}
