package test;

public class Motor {
	
	int numeroCilindros;
	String tipo;
	static int registro;
	
	void cambiarRegistro(int nuevoRegistro) {
		
		this.registro = nuevoRegistro;
		
	}
	
	void asignarTipo(String nuevoTipo) {
		
		if (nuevoTipo=="gasolina" || nuevoTipo=="electrico") {
			
			this.tipo = nuevoTipo;
			
		}
		
		
	}
}
