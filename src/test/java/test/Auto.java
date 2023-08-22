package test;

public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	int registro;
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
		if (Auto.registro.equals(Asiento.registro) && 
			Auto.registro.equals(Motor.registro)	) {
			
			System.out.println("Auto original");
		}
		
		else{
			
			System.out.println("Las piezas no son originales");
			
			}
		
			
			
			
		}
	}
	

