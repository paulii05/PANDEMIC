package Modelo;

public class Ciudad {
	private String nombre;
	private int[] coordenadas;
	private String enfermedad;
	private int infeccion;
	private String[] ciudadesColindantes;
	
	public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int[] getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(int[] coordenadas) {
        this.coordenadas = coordenadas;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public int getInfeccion() {
        return infeccion;
    }

    public void setInfeccion(int infeccion) {
        this.infeccion = infeccion;
    }

    public String[] getCiudadesColindantes() {
        return ciudadesColindantes;
    }

    public void setCiudadesColindantes(String[] ciudadesColindantes) {
        this.ciudadesColindantes = ciudadesColindantes;
    }
    
	public void aumentarInfeccion() {
		
	}
	
	public void disminuirInfeccion() {
		
	}
	
	public void propagarInfeccion() {
		
	}
}