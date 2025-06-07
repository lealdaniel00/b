public abstract class SerVivo{
	private int edad;
	private String nombre;
	private String reino;
	private String nombreCientifico;
	SerVivo(int edad, String nombre, String reino, String nombreCientifico){
		this.edad=edad;
		this.nombre=nombre;
		this.reino=reino;
		this.nombreCientifico=nombreCientifico;
	}
	public void cumplirAnios(){
		edad=edad+1;
	}
	public abstract void comunicar();
	public String getNombre(){
		return nombre;
	}
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
}