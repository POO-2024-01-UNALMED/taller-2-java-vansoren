package test;
public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	int cantidadAsientos() {
		int cantidad=0;
		for(int i=0;i<asientos.length;i++) {
			if ( asientos[i]!=null ) {
				cantidad++;
			}
		}
	return cantidad;
	}
	String verificarIntegridad() {
		if(this.registro==this.motor.registro) {
			for(int i=0;i<asientos.length;i++) {
				if(this.registro!=asientos[i].registro && asientos[i]!=null) {
					return "Las piezas no son originales";
				}
				else {
					return "Auto original";
				}
			}
		}
		else {
			return "Las piezas no son originales";
		}
	}
}
