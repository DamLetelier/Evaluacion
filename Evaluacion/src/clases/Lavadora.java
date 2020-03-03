package clases;
import clases.Electrodomestico;

public class Lavadora extends Electrodomestico {


	
	protected int carga = 5;

	public int getCarga() {
		return carga;
	}


	public Lavadora() {
		//super();
	
	}

	public Lavadora(int precioB, int peso) {
		super(precioB, peso);
		
	}

	public Lavadora(int precioB, String color, char consumoE, int peso, int carga) {
		super(precioB, color, consumoE, peso);
		this.carga = carga;
		
	}
	
	
	public int precioFinal(int carga, int precioB) {
		
		if(carga>=30) {
			precioB = precioB + 50;
		}
				
		return precioB;
	}

}
