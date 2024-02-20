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
		int cantidadAsientos=0;
		for(Asiento i:this.asientos) {
			if ( i!=null ) {
				cantidadAsientos++;
			}
		}
	return cantidadAsientos;
	}
	String verificarIntegridad() {
		if(this.registro==this.motor.registro) {
			for(Asiento i:this.asientos) {
				if(this.registro!=i.registro) {
					return "Las piezas no son originales";
				}
			}
		return "Auto original";
		}
		else {
			return "Las piezas no son originales";
		}
	}
}
