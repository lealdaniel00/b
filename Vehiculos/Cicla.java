public class Cicla extends MedioTransporte{
	String manubrio;
	Cicla(String manubrio, int tamanio, int velMax, int cantPasajeros, String medio){
		super(tamanio,velMax,cantPasajeros,medio);
		this.manubrio=manubrio;
	}
	public void tensionarCadena(){
		System.out.println("Me unté las manos de grasa.");
	}
	public void maniobrar(){
		System.out.println("Esquive un hueco. Felicidades no te pinchaste CRACK");
	}
}