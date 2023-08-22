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
	
	public void verificarIntegridad() {
        if (registro == asientos[0].registro && registro == motor.registro) {
            System.out.println("Auto original");
        } else {
            System.out.println("Las piezas no son originales");
        }
    }
}
	

