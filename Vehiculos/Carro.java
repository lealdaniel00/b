public class Carro extends MedioTransporte{
	String volante;
	Carro(String volante,int tamanio, int velMax, int cantPasajeros, String medio){
		super(tamanio,velMax,cantPasajeros,medio);
		this.volante=volante;
	}
	public void arranque(){
		System.out.println("El carro arranca");
		arrancar();
	}
	public void maniobrar(){
		System.out.println("Esquive una persona.");
	}
}