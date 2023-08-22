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
		if (registro == Asiento.registro && registro == Motor.registro	) {
			
			return("Auto original");
		}
		
		else{
			
			return("Las piezas no son originales");
			
			}
		
			
			
			
		}
	}
	

