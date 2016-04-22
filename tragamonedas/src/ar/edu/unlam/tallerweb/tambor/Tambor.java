package ar.edu.unlam.tallerweb.tambor;

import java.util.Random;

public class Tambor {
	
	public Tambor(){
		if(random == null){
			random = new Random();
		}
	}
	
	private Random random;
	private Integer posicion = 0;
	private Integer valorMinimoTambor = 1;
	private Integer valorMaximoTambor = 8;
	
	public Boolean girar() {
		posicion = random.nextInt((valorMaximoTambor - valorMinimoTambor) + 1) + valorMinimoTambor;
		return posicion != 0;
	}
	
	public Integer obtenerPosicion(){
		return posicion;
	}
}
