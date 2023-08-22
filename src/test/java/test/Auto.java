package test;

public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
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
	
	void verificarIntegridad() {
		if (registro == Motor.registro	) {
			
			for (Asiento asiento : asientos) {
		         if (registro == asiento.registro) {
		            
		        	 System.out.println("Auto original");
		        	 
		             }
			
			else{
			
			System.out.println("Las piezas no son originales");
			
			     }
		
			
			
			
		  }
	  }

	}
}

