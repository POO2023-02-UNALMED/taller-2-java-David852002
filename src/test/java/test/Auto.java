package test;

public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	static int registro;
	int cantidadCreados;
	
		
	
	int cantidadAsientos() {
	 
	int contador =0;
	
	for (Asiento asiento : asientos) {
         if (asiento != null) {
             contador++;
             }
	   }
	return contador;
	}
	
	String verificarIntegridad() {
		if (Auto.registro != Asiento.registro && Auto.registro != Motor.registro	) {
			
			return("Las piezas no son originales");
		}
		
		else{
			
			return("Auto original");
			
			}
		
			
			
			
		}
	}
	

