package Modelo;

import java.util.ArrayList;

public class DatosPartida {
	private ArrayList<String> ciudades;
	private ArrayList<String> virus;
	private ArrayList<String> vacunas;
	private int brotes;
	private int rondas;
	private float pDesarrollo;
	private int acciones;
	
	public ArrayList<String> getCiudades() {
        return ciudades;
    }

    public void setCiudades(ArrayList<String> ciudades) {
        this.ciudades = ciudades;
    }

    public ArrayList<String> getVirus() {
        return virus;
    }

    public void setVirus(ArrayList<String> virus) {
        this.virus = virus;
    }

    public ArrayList<String> getVacunas() {
        return vacunas;
    }

    public void setVacunas(ArrayList<String> vacunas) {
        this.vacunas = vacunas;
    }

    public int getBrotes() {
        return brotes;
    }

    public void setBrotes(int brotes) {
        this.brotes = brotes;
    }

    public int getRondas() {
        return rondas;
    }

    public void setRondas(int rondas) {
        this.rondas = rondas;
    }

    public float getPDesarrollo() {
        return pDesarrollo;
    }

    public void setPDesarrollo(float pDesarrollo) {
        this.pDesarrollo = pDesarrollo;
    }

    public int getAcciones() {
        return acciones;
    }

    public void setAcciones(int acciones) {
        this.acciones = acciones;
    }
    
	public void modificarCiudad(String nCiudad, int modificacion) {
		
	}
	
	public void modificarVacuna(String nVacuna, float modificacion) {
		
	}
	
	public void cargarDatos() {
		
	}
}