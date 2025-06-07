public class Principal{
	public static void main(String args[]){
		Carro mazda323 = new Carro("Volante en cuero",5,120,5,"Terrestre");
		mazda323.arranque();
		mazda323.maniobrar();
		Carro toyotaHilux = new Carro("Volante en diamantes",9,210,5,"Terrestre");
		toyotaHilux.arranque();
		Cicla gw = new Cicla("Manubrio en fibra de carbono",2,115,1,"Terrestre impulsado mecánica");
		gw.maniobrar();
		Avion boeing737 = new Avion("Timon en polimero",73,842,174,"Aereo");
		boeing737.arrancar();
		boeing737.prenderTurbina();
	}
}