public abstract class MedioTransporte{
	int tamanio;
	int velMax;
	int cantidadPasajeros;
	String medio;
	MedioTransporte(int tamanio, int velMax, int cantidadPasajeros, String medio){
		this.tamanio=tamanio;
		this.velMax=velMax;
		this.cantidadPasajeros=cantidadPasajeros;
		this.medio=medio;
	}
	public void arrancar(){
		System.out.println("ME MOVI");
	}
	public void frenar(){
		System.out.println("FRENE");
	}
	public abstract void maniobrar();
	public int getTamanio(){
		return tamanio;
	}
	public int getVelMax(){
		return velMax;
	}
	public int getCantidadPasajeros(){
		return tamanio;
	}
	public String getMedio(){
		return tamanio;
	}
	
}