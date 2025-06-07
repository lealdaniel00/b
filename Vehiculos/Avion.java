public class Avion extends MedioTransporte{
	String timon;
	Avion(String timon,int tamanio, int velMax, int cantPasajeros, String medio){
		super(tamanio,velMax,cantPasajeros,medio);
		this.timon=timon;
	}
	public void prenderTurbina(){
		System.out.println("Prende la BCOME");
	}
	public void maniobrar(){
		System.out.println("Esquivasque un mal clima. Gracias capitán.");
	}
}