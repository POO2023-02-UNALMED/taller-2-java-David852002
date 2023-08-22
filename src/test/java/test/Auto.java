package test;

public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	static int registro;
	int cantidadCreados;
	
		
	
	public int cantidadAsientos() {
	 
	int contador =0;
	
	for (Asiento asiento : asientos) {
         if (asiento != null) {
             contador++;
             }
	   }
	return contador;
	}
	
	public void verificarIntegridad() {
		if (registro == Asiento.registro && registro == Motor.registro	) {
			
			System.out.println("Auto original");
		}
		
		else{
			
			System.out.println("Las piezas no son originales");
			
			}
		
			
			
			
		}
	}
	

