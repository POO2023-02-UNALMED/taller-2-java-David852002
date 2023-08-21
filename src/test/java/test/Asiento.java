package test;

public class Asiento {
	
	public String color;
	public int precio;
	public static  int registro;

	public Asiento(String ncolor, int nprecio, int nregistro) {
		this.color = ncolor;
		this.precio = nprecio;
		this.registro = nregistro;
		
	}

	
	public void cambiarColor(String color ) {		
		if(color=="rojo" || color=="verde" || color=="amarillo" 
		|| color=="negro" || color=="blanco"	) 
		
		{
			this.color = color;
		}
			
	}
}
