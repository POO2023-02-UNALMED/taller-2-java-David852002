package test;

public class Motor {
	
	public int numeroCilindros;
	public String tipo;
	public static int registro;
	
	public void cambiarRegistro(int nuevoRegistro) {
		
		this.registro = nuevoRegistro;
		
	}
	
	public void asignarTipo(String nuevoTipo) {
		
		if (nuevoTipo=="gasolina" || nuevoTipo=="electrico") {
			
			this.tipo = nuevoTipo;
			
		}
		
		
	}
}
