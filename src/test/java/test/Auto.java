package test;

public class Auto {
	public String modelo;
	public int precio;
	public Asiento[] asientos;
	public String marca;
	public  int registro;
	public int cantidadCreados;
	
		
	
	public int cantidadAsientos() {
	return asientos.length;	
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
	

