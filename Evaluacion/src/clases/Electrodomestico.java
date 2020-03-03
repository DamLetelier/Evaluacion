package clases;

public class Electrodomestico {

	protected int precioB=100000;
	protected String color="Blanco";      //"blanco", "negro", "rojo", "azul", "gris";
	public char consumoE='F';            /*'A','a','B','b','C','c','D','d','E','e'*/
	protected int peso=4;
	
	public Electrodomestico() {
		super();
		
	}
	
	

	public int getPrecioB() {
		return precioB;
	}


	public String getColor() {
		return color;
	}

	
	public char getConsumoE() {
		return consumoE;
	}



	public int getPeso() {
		return peso;
	}


	public Electrodomestico(int precioB, int peso) {
		super();
		this.precioB = precioB;
		this.peso = peso;
	}

	
	
public Electrodomestico(int precioB, String color, char consumoE, int peso) {
		super();
		this.precioB = precioB;
		this.color = color;
		this.consumoE = consumoE;
		this.peso = peso;
	}


	public char comprobarConsumoEnergetico() {
		
		if(consumoE!='A' && consumoE!='a' && consumoE!='B' && consumoE!='b' && consumoE!='C' && consumoE!='c' && consumoE!='D' && consumoE!='d' && consumoE!='E' && consumoE!='e' && consumoE!='f' && consumoE!='F') {
			consumoE='F';
		}
		
		return consumoE;

	}
	
	   
	
//ver ignore case
	public String comprobarColor() {
		
		if(color.equalsIgnoreCase("blanco")) {
			   color="Blanco";
		   }else if(color.equalsIgnoreCase("gris")) {
			   color="Gris";
		   }else if(color.equalsIgnoreCase("negro")) {
			  color="Negro";
		   }else if(color.equalsIgnoreCase("rojo")) {
			   color="Rojo";
		   }else if(color.equalsIgnoreCase("azul")) {
			   color="Azul";
		   }else
			  color="Blanco";
		
		return color;
	 }
	
		
	public int precioFinal(char consumoE) {
		
		
	        if (consumoE=='A' || consumoE=='a') {
	        	precioB = precioB + 100;
	        }else if(consumoE=='B' || consumoE=='b') {
	        	precioB = precioB + 80;
	        }else if(consumoE=='C' || consumoE=='c') {
	        	precioB = precioB + 60;
	        }else if(consumoE=='D' || consumoE=='d') {
	        	precioB = precioB + 50;
	        }else if(consumoE=='E' || consumoE=='e') {
	        	precioB = precioB + 30;
	        }else if(consumoE=='F' || consumoE=='f') {
	        	precioB = precioB + 10;
	        }else {
	        	System.out.println(" Precio final no corresponde a consumo electrico, favor revisar datos.");
	        }
	        
	        if(peso>=0 && peso<=19) {
	        	precioB = precioB + 10;
	        }else if(peso>=20 && peso<=49) {
	        	precioB = precioB + 50;
	        }else if(peso>=50 && peso<=79) {
	        	precioB = precioB + 80;
	        }else if(peso>=80){
	        	precioB = precioB + 100;
	        }else {
	        	System.out.println("Precio final no corresponde a peso, favor revisar datos.");
	        }
	        
			return precioB;
	    }
		

	}
	

