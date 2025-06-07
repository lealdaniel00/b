public class MiPrimerPrograma{
	public static void main(String args[]){
		Calculadora casio = new Calculadora();
		casio.sumar(8,9);
		System.out.println(casio.restar(8,9));
		HumanoPensante juan = new HumanoPensante(28,"Juan",'M',10);
		HumanoPensante andres = new HumanoPensante(27,"Andres",'M',6);
		juan.envejecer();
		andres.cumplirAnios();
		System.out.println(juan.getNombre());
		juan.setNombre("Sebastian");
		System.out.println(juan.getNombre());
		andres.comer();
		andres.comer(100);
		andres.comer(true);
		andres.comunicar();
	}
}