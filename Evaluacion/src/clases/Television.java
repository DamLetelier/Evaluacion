package clases;
import clases.Electrodomestico;

public class Television extends Electrodomestico {
	protected int resolucion=20;
	protected boolean sintonizador = false;
	
	
	public Television() {
		super();
	}


	public Television(int precioB, int peso) {
		super(precioB, peso);
		// TODO Auto-generated constructor stub
	}


	public Television(int precioB, String color, char consumoE, int peso, int resolucion, boolean sintonizador) {
		super(precioB, color, consumoE, peso);
		this.resolucion=resolucion;
		this.sintonizador=sintonizador;
	
	}


	public int getResolucion() {
		return resolucion;
	}


	public boolean isSintonizador() {
		
		
		return sintonizador;
		
	}

	
	public int precioFinal(int resolucion, boolean sintonizador, int precioB) {
		
		
		if(resolucion>=40) {
			double por = 1.3;
			precioB = (int) (precioB*(por));
		}
		
		if(sintonizador==true) {
			precioB = precioB+ 50;
		}
				
		return precioB;
	}

	
}
