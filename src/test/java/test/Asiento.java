package test;
public class Asiento {
	String color;
	int precio;
	int registro;
	void cambiarColor(String color) {
		String [] colores= {"rojo","verde","amarillo","negro","blanco"};
		for(String i:colores) {
			if(color==i) {
				this.color=color;
			}
		}
			
	}
}
