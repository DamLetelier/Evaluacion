package principal;

import clases.Electrodomestico;
import clases.Lavadora;
import clases.Television;

public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int electro = 0; int lavadora = 0; int tele = 0; int total=0;
		int PFL = 0; int PFT=0;
	
		Lavadora l = new Lavadora();
		Television t = new Television();
		
		Electrodomestico arrayElectro[]=new Electrodomestico[10];
		
				//precios en EURO
		arrayElectro[0] = new Electrodomestico(420, "rojo", 'B', 3);
		arrayElectro[1] = new Lavadora(600, "RojO", 'G', 10, 35);
		arrayElectro[2] = new Television(380, "blaNCo", 'E', 50, 50, false);
		arrayElectro[3] = new Electrodomestico(335, "gris", 'A', 15);
		arrayElectro[4] = new Lavadora(765, "azul", 'a', 40, 30);
		arrayElectro[5] = new Television(650, "blaNCo", 'E', 70, 80, true);
		arrayElectro[6] = new Electrodomestico(610, "rojo", 'j', 40);
		arrayElectro[7] = new Lavadora(3830, "amarillo", 'a', 50, 30);
		arrayElectro[8] = new Television(8480, "GriS", 'H', 10 , 20, true);
		arrayElectro[9] = new Lavadora(310, "rosado", 'R', 30, 30);
		
				
		for(int i=0; i<arrayElectro.length;i++) {
			
			
			System.out.println("Precio Base: "+arrayElectro[i].getPrecioB()+"€");		
			System.out.println("Color: "+arrayElectro[i].comprobarColor());
			System.out.println("Peso: "+arrayElectro[i].getPeso());
			
	
			
			if(arrayElectro[i] instanceof Electrodomestico) {	
				if(!(arrayElectro[i] instanceof Lavadora) && !(arrayElectro[i] instanceof Television)) {
					System.out.println("Consumo: "+arrayElectro[i].comprobarConsumoEnergetico());
					electro = electro + arrayElectro[i].precioFinal(arrayElectro[i].getConsumoE());
										
				}
				
			}
			
			if(arrayElectro[i] instanceof Lavadora) {	
				
				System.out.println("Carga: "+((Lavadora) arrayElectro[i]).getCarga());
				System.out.println("Consumo: "+arrayElectro[i].comprobarConsumoEnergetico());
				lavadora = (lavadora + arrayElectro[i].precioFinal(arrayElectro[i].comprobarConsumoEnergetico()));
				
				PFL = l.precioFinal(((Lavadora) arrayElectro[i]).getCarga(),((Lavadora) arrayElectro[i]).getPrecioB());
				System.out.println("Nuevo Precio: "+(PFL)+"€");
				
			}
			
			if(arrayElectro[i] instanceof Television) {
				
				int resolucion = ((Television) arrayElectro[i]).getResolucion();
				
				System.out.println("Pulgadas: "+resolucion);
				if(((Television) arrayElectro[i]).isSintonizador()==true) {
					System.out.println("Sintonizador: Si");
				}else {
					System.out.println("Sintonizador: No");
				}
				
				arrayElectro[i].getConsumoE();
				System.out.println("Consumo: "+arrayElectro[i].comprobarConsumoEnergetico());
				
				tele = tele + ((Television)arrayElectro[i]).precioFinal(arrayElectro[i].comprobarConsumoEnergetico());
				PFT = t.precioFinal(resolucion, ((Television) arrayElectro[i]).isSintonizador(),((Television) arrayElectro[i]).getPrecioB());
				System.out.println("Nuevo Precio: "+(PFT)+"€");
				
							
			}
			
			System.out.println("\n");
						
		}
		
		System.out.println("\n");
		System.out.println("- - - - - - - - - - - - - -");
		System.out.println("Total Electro:      "+electro+"€");
		System.out.println("Total Lavadoras:    "+lavadora+"€");
		System.out.println("Total Televisores:  "+tele+"€");
		
		System.out.println("Precio Total:       "+(electro+lavadora+tele)+"€");
		System.out.println("- - - - - - - - - - - - - -");
		
	}

}
