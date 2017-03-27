package commad;

import java.util.Scanner;

public class Cliente {

	public static void main(String[] args) {
		PanelFrontal miPanel = new PanelFrontal();
		
		Scanner sc = new Scanner(System.in);
		Impresor visor = new Impresor();
		
		Comando eleccion = null;
		
		visor.imprimir("Presiona 'a' para aumentar velocidad y 'b' para disminuir la velocidad");
		switch(sc.nextLine()){
			case "a":
				eleccion = new ComandoAumentarCambio();
				break;
			case "b":
				eleccion = new ComandoDisminuirCambio();
				break;
		}
		
		miPanel.asignarComando(eleccion);
		
		miPanel.palancaAccionada();

	}

}
