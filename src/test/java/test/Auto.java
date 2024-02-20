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
		for(Asiento i:asientos) {
			if ( i!=null ) {
				cantidad++;
			}
		}
		return cantidad;
		
	}
	String verificarIntegridad() {
		if(registro==motor.registro) {
			for(Asiento i:this.asientos) {
				if(registro!=i.registro) {
					return "Las piezas no son originales";
				}
			return "Auto original";
			}
		}
		else {
			return "Las piezas no son originales";
		}
	}
}
