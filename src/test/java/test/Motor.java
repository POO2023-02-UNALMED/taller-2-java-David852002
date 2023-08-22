package test;

public class Motor {
	
	int numeroCilindros;
	String tipo;
	static int registro;
	
	void cambiarRegistro(int registro) {
		
		Motor.registro = registro;
		
	}
	
	void asignarTipo(String tipo) {
		
		if (tipo=="gasolina" || tipo=="electrico") {
			
			this.tipo = tipo;
			
		}
		
		
	}
}
