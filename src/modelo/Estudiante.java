package modelo;

import java.util.Date;

public class Estudiante extends Persona {
	private int grupo;
	private String fechaIngreso;

	public Estudiante(String nif, String nombre, char sexo, Date fecha, int grupo, String fechaIngreso) {
		super(nif, nombre, sexo, fecha);
		this.grupo = grupo;
		this.fechaIngreso = fechaIngreso;
		
	}

	public String getFechaIngreso(){
		return fechaIngreso;
	}
	
	public void setFechaIngreso(String fechaIngreso){
		this.fechaIngreso = fechaIngreso;
	}
	
	public int getGrupo() {
		return grupo;
	}

	public void setGrupo(int grupo) {
		this.grupo = grupo;
	}

}
